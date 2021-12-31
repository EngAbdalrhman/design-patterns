package designpatterns.filterpattern;

import java.util.List;

public abstract class Criteria {
	
	public abstract List<Person> meetCriteria (List<Person> persons);
	
	public  void printPersons(List<Person> persons){
		List<Person> criteria = this.meetCriteria(persons);
	      for (Person person : criteria) {
	         System.out.println(person);
	      }
	      System.out.println(" ------------------ ");
	   }      
}
