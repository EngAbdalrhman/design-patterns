package designpatterns.filterpattern;

import java.util.*;

public class CriteriaMarried extends Criteria{
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> marriedPersons = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getStatus().equalsIgnoreCase("married")) 
			{
				marriedPersons.add(person);
			}
		}
		return marriedPersons;
	}
}
