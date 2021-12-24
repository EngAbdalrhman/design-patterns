package designpatterns.factorypattern.sms;

import designpatterns.factorypattern.Notification;
// Carrier
public class Etislat implements Notification {

	public void send() {
		System.out.println("Send Via Etislat");
		
	}

	public void recive(String Data) {
		System.out.println("Recived "+ Data);
		
	}

}
