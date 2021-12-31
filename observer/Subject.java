package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	// storage of all observe objects
	private List<Observer> observer = new ArrayList<Observer>();
	private int state;
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		// set the number to convert
		this.state = state;
		// send data to all related observer objects to convert using the list
		notifyAllObservers();
	}
	
	public void attach(Observer observer)
	{
		// add to list
		this.observer.add(observer);
	}
	
	public void notifyAllObservers() 
	{
		// notify all observe object in the list.
		for (Observer observe : observer) {
			observe.update();
		}
	}
}
