package classes;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager;
		
		
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
	}

}