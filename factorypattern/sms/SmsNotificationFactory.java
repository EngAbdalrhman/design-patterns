package designpatterns.factorypattern.sms;

import java.util.ArrayList;
import java.util.List;

import designpatterns.factorypattern.NotificationMaster;
import designpatterns.factorypattern.Notification;

public class SmsNotificationFactory extends NotificationMaster{
	
	public static Notification getCarier(String PhoneNumber) throws Exception 
	{
		if (PhoneNumber.startsWith("010"))
			return new Vodafone();
		else if (PhoneNumber.startsWith("012"))
			return new Orange();
		else if (PhoneNumber.startsWith("011"))
			return new Etislat();
		else throw new Exception();
	}

	@Override
	public Notification getDefault(String Method) throws Exception {
		// TODO Auto-generated method stub
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
