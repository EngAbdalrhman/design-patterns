package designpatterns.observer;

public class HexObserver extends Observer{
	
	public HexObserver(Subject subject)
	{
		this.subject = subject;
		// this subject pointer to subject (same address) so we can use any of them , add observer to list.
		subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Hexa To String ..."+ Integer.toHexString(subject.getState()).toUpperCase());
	}
}
