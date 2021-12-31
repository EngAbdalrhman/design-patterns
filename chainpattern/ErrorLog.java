package designpatterns.chainpattern;

public class ErrorLog extends AbstractLogger{
	
	public ErrorLog(int level) 
	{
		this.level = level;
	}
	@Override
	protected void write(String message) {
		System.out.println("Error Console::Logger: " + message);
	}
}
