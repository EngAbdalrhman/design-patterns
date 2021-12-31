package designpatterns.observer;

public class OctalObserver extends Observer{
	
	public OctalObserver (Subject subject)
	{
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		// converting using the convert method in integer class.
		System.out.println("Octal To String ..."+ Integer.toOctalString(subject.getState()));
	}
}
