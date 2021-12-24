package designpatterns.factorypattern;

import designpatterns.factorypattern.email.MailNotificationFactory;
import designpatterns.factorypattern.sms.SmsNotificationFactory;

public class AbstractNotification {
	public static NotificationMaster getFactory(String Text) 
	{
		if((Text.charAt(0) >= 48) && (Text.charAt(0) <=57))
			return new SmsNotificationFactory();
		else
			return new MailNotificationFactory();
	}
}
