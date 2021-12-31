package designpatterns;
import java.util.ArrayList;
import java.util.List;
/***
 * Author : Abdalrhman Mostafa
 * 2021 / 2022
 ***/
import java.util.Scanner;

import designpatterns.factorypattern.AbstractNotification;
import designpatterns.factorypattern.sms.SmsNotificationFactory;
import designpatterns.filterpattern.AndCriteria;
import designpatterns.filterpattern.Criteria;
import designpatterns.filterpattern.CriteriaFemale;
import designpatterns.filterpattern.CriteriaMale;
import designpatterns.filterpattern.CriteriaMarried;
import designpatterns.filterpattern.CriteriaSingle;
import designpatterns.filterpattern.OrCriteria;
import designpatterns.filterpattern.Person;
import designpatterns.flyweight.COLORS;
import designpatterns.flyweight.Circle;
import designpatterns.flyweight.ShapeFactory;
import designpatterns.mvcpattern.Student;
import designpatterns.mvcpattern.StudentController;
import designpatterns.mvcpattern.StudentView;
import designpatterns.observer.BinaryObserver;
import designpatterns.observer.HexObserver;
import designpatterns.observer.OctalObserver;
import designpatterns.observer.Subject;
import designpatterns.proxypattern.Image;
import designpatterns.proxypattern.ProxyImage;
//import designpatterns.*;
//import designpatterns.builderpattern.Person;
import designpatterns.builderpattern.PersonBuilder;
import designpatterns.chainpattern.AbstractLogger;
import designpatterns.chainpattern.ConsoleLog;
import designpatterns.chainpattern.ErrorLog;
import designpatterns.chainpattern.FileLog;

public class Testing {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		//System.out.println("Enter your contact");
		//String contact = input.nextLine();
		
		//filter();
		//proxy("img.jpg");
		
		//chainofresponsability("Testing ...");
		//mvc();
		
		//flyweight();
		observer(15);
	}
	static void factory(String contact) 
	{
		// sms factory
		try {
			SmsNotificationFactory.getCarier(contact).send();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// factory parent
		try {
			AbstractNotification.getFactory(contact).getDefault(contact).send();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void builder() 
	{
		// remove the import of person class from filterpattern to use builder
		//Person p = new PersonBuilder().id(1).name("abdo").builder();
		//System.out.println(p);
	}
	static void filter() 
	{
		List<Person> persons = new ArrayList();
		persons.add(new Person("Abdalrhman","Male","Single"));
		persons.add(new Person("Mohamed","Male","Married"));
		persons.add(new Person("Ahmed","Male","Single"));
		persons.add(new Person("Rozan","Female","Single"));
		persons.add(new Person("Bassant","Female","Single"));
		persons.add(new Person("Sara","Female","Married"));
		
		
		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria single = new CriteriaSingle();
		Criteria married = new CriteriaMarried();
		Criteria singleMale = new AndCriteria(single,male);
		Criteria marriedFemale = new AndCriteria(married,female);
		Criteria marriedormale = new OrCriteria(married,male);
		
		male.printPersons(persons);
		female.printPersons(persons);
		single.printPersons(persons);
		married.printPersons(persons);
		singleMale.printPersons(persons);
		marriedormale.printPersons(persons);

	}
	
	static void proxy(String fileName) {
		Image img = new ProxyImage(fileName);
		img.display();
		System.out.println("another load");
		img.display();
	}
	private static AbstractLogger  getChain() {
		AbstractLogger consoleLog = new ConsoleLog(AbstractLogger.INFO);
		AbstractLogger fileLog = new FileLog(AbstractLogger.DEBUG);
		AbstractLogger errorLog = new ErrorLog(AbstractLogger.ERROR);
		
		// create a chain
		consoleLog.setNextLogger(fileLog);
		fileLog.setNextLogger(errorLog);
		
		// return the head pointer
		return consoleLog;
	}
	
	static void chainofresponsability(String Message) 
	{
		AbstractLogger log = getChain();
		log.logMessage(AbstractLogger.DEBUG, Message);
	}
	
	static void mvc() 
	{
		// could get model from DB for example.
		Student model = new Student();
		
		// view ----> console
		StudentView view = new StudentView();
		
		// create controller that controls model and view
		StudentController control = new StudentController(model,view);
		
		control.updateView();
		
		// cahnging data
		control.setName("Abdo");
		control.updateView();
		control.setId("007");
		control.updateView();
		
	}
	
	static void flyweight() 
	{
		final String colors[] = {"RED","BLUE","GREEN","ORANGE","YELLOW","LIGHTBLUE","PURBLE","BROWN","BLACK"};
		
		for (int i = 0; i < colors.length; i++) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor(colors));
			circle.setX((int) (Math.random()*100));
	        circle.setY((int) (Math.random()*100));
	        circle.setRadius((int) (Math.random()*100));
	        circle.draw();
		}
	}
	static String getRandomColor(String colors[]) 
	{
		// random -> double number * range
		 return colors[(int)(Math.random()*colors.length)];
	}

	static void observer(int num) 
	{
		Subject sub = new Subject();
		new HexObserver(sub);
		new BinaryObserver(sub);
		new OctalObserver(sub);
		System.out.println("this is the state of "+ num);
		sub.setState(num);
	}
}
