package designpatterns.chainpattern;

public abstract class AbstractLogger {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	
	protected int level;
	// next chain pointer
	protected AbstractLogger nextLogger;
	public AbstractLogger getNextLogger() {
		return nextLogger;
	}
	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}
	
	public void logMessage (int Level, String Message)
	{
		if(this.level <= Level)
			write (Message);
		if (nextLogger != null)
			nextLogger.logMessage(Level, Message);
	}
	protected abstract void write(String message);
}
