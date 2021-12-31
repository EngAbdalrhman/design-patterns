package designpatterns.chainpattern;

public class ConsoleLog extends AbstractLogger{

		public ConsoleLog(int level) 
		{
			this.level = level;
		}
	@Override
	protected void write(String message) {
		System.out.println("Standard Console::Logger: " + message);
	}

}
