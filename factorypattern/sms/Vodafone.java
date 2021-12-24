package designpatterns.factorypattern.sms;

import designpatterns.factorypattern.Notification;

public class Vodafone implements Notification {

	public void send() {
		System.out.println("Send Via Vodanfone");
		
	}

	public void recive(String Data) {
		System.out.println("Recived "+ Data);
		
	}

}
