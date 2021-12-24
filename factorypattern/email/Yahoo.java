package designpatterns.factorypattern.email;

import designpatterns.factorypattern.Notification;

public class Yahoo implements Notification{

	@Override
	public void send() {
		System.out.println("Sending Via Yahoo");
		
	}

	@Override
	public void recive(String Data) {
		System.out.println("Reciving Via Yahoo");
	}
	
}
