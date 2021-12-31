package designpatterns.filterpattern;

import java.util.List;

public class OrCriteria extends Criteria{
	private Criteria criteria;
	private Criteria otherCriteria;
	
	// passing criteria like single , male as list then add them to 1 list
	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}
	
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteria = criteria.meetCriteria(persons);
		List<Person> secoundCriteria = otherCriteria.meetCriteria(persons);
		
		for (Person person : secoundCriteria) {
			if(!firstCriteria.contains(person))
				firstCriteria.add(person);
		}
		return firstCriteria;
	}
}
