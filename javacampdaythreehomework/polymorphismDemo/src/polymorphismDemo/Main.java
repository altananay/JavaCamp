package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
		
		for (BaseLogger logger: loggers)
		{
			logger.Log("mesaj");
		}
		
		CustomerManager customerManager = new CustomerManager(loggers[0]);
		customerManager.Add();
	}
}