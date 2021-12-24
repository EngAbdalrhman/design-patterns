package designpatterns;

import java.util.Scanner;

import designpatterns.factorypattern.AbstractNotification;
import designpatterns.factorypattern.sms.SmsNotificationFactory;

public class Testing {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Enter your phone");
		String phone = input.nextLine();
		
//		try {
//			SmsNotificationFactory.getCarier(phone).send();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			AbstractNotification.getFactory(phone).getDefault(phone).send();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
