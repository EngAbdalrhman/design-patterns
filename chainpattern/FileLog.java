package designpatterns.chainpattern;

public class FileLog extends AbstractLogger{
	
	 public FileLog(int level){
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) {		
	      System.out.println("File::Logger: " + message);
	   }
}
