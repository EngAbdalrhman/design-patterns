package designpatterns.factorypattern.sms;

import java.util.ArrayList;
import java.util.List;

import designpatterns.factorypattern.NotificationMaster;
import designpatterns.factorypattern.Notification;

public class SmsNotificationFactory extends NotificationMaster{
	static Vodafone voda = new Vodafone();
	static Orange orng = new Orange();
	static Etislat etis = new Etislat();
	// factory pattern selected which object should returned
	public static Notification getCarier(String PhoneNumber) throws Exception 
	{
		if (PhoneNumber.startsWith("010"))
			return voda;
		else if (PhoneNumber.startsWith("012"))
			return orng;
		else if (PhoneNumber.startsWith("011"))
			return etis;
		else throw new Exception();
	}

	@Override
	public Notification getDefault(String Method) throws Exception {
		return getCarier(Method);
	}

	@Override
	public List<String> getMethods() {
		List<String> methods = new ArrayList<String>();
		methods.add("Vodafone");
		methods.add("Orange");
		methods.add("Etislat");
		return methods;
	}
}
