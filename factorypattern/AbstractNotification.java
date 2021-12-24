package designpatterns.factorypattern;

import designpatterns.factorypattern.email.MailNotificationFactory;
import designpatterns.factorypattern.sms.SmsNotificationFactory;

public class AbstractNotification {
	public static NotificationMaster getFactory(String Text) 
	{
		//factory of the factory (Selecting which obj. should be returned)
		// if started with number , sure it is a phone number
		if((Text.charAt(0) >= 48) && (Text.charAt(0) <=57))
			return new SmsNotificationFactory();
		else
			// when the text start with char so it's email here
			return new MailNotificationFactory();
	}
}
