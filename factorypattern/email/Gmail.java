package designpatterns.factorypattern.email;

import designpatterns.factorypattern.Notification;

public class Gmail implements Notification{

	@Override
	public void send() {
		System.out.println("Sending Via Gmail");
		
	}

	@Override
	public void recive(String Data) {
		System.out.println("Reciving Via Gmail");
	}
	
}
