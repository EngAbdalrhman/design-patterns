package designpatterns.filterpattern;

import java.util.*;

public class CriteriaMale extends Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		
		List<Person> malePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getGender().equalsIgnoreCase("Male")) 
			{
				malePersons.add(person);
			}
		}
		return malePersons;
	}
	
}
