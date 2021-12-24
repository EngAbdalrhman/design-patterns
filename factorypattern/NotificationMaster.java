package designpatterns.factorypattern;

import java.util.List;

public abstract class NotificationMaster {
	// parent Factory
	public abstract Notification getDefault(String Method) throws Exception;
	public abstract List<String> getMethods();
}
