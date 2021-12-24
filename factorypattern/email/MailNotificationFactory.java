package designpatterns.factorypattern.email;

import java.util.ArrayList;
import java.util.List;

import designpatterns.factorypattern.NotificationMaster;
import designpatterns.factorypattern.Notification;

public class MailNotificationFactory extends NotificationMaster{
	
	public static Notification getCarier(String Email) throws Exception 
	{
		if (Email.contains("gmail"))
			return new Gmail();
		else if (Email.contains("yahoo"))
			return new Yahoo();
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
		methods.add("Gmail");
		methods.add("Yahoo");
		return methods;
	}
}
