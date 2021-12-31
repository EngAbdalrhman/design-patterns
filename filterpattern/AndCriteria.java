package designpatterns.filterpattern;

import java.util.List;

public class AndCriteria extends Criteria{
	private Criteria criteria;
	private Criteria otherCriteria;
	// passing 2 Criterias like married female and anding them (if there are both return list of them)
	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}
	
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteria = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteria);
	}

}
