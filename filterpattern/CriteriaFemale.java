package designpatterns.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale extends Criteria{
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> femalePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getGender().equalsIgnoreCase("FeMale")) 
			{
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}
}
