package designpatterns;
/***
 * Author : Abdalrhman Mostafa
 * 2021 / 2022
 ***/
import java.util.Scanner;

//import designpatterns.*;
import designpatterns.builderpattern.Person;
import designpatterns.builderpattern.PersonBuilder;
//import designpatterns.factorypattern.sms.SmsNotificationFactory;

public class Testing {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		//System.out.println("Enter your contact");
		//String contact = input.nextLine();
		
//		try {
//			SmsNotificationFactory.getCarier(phone).send();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			AbstractNotification.getFactory(contact).getDefault(contact).send();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Person p = new PersonBuilder().id(1).name("abdo").builder();
		System.out.println(p);
	}

}
