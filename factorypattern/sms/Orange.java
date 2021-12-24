package designpatterns.factorypattern.sms;

import designpatterns.factorypattern.Notification;

public class Orange implements Notification {

	public void send() {
		System.out.println("Send Via Orange");
		
	}

	public void recive(String Data) {
		System.out.println("Recived "+ Data);
		
	}

}
