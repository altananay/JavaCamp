package oop;

public class CustomerManager {
	
	private Customer customer;
	private ICreditManager _creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager)
	{
		this.customer = customer;
		_creditManager = creditManager;
	}
	
	public void Save()
	{
		System.out.println("Müşteri kaydedildi.");
	}
	
	public void GiveCredit()
	{
		_creditManager.Calculate();
		System.out.println("kredi verildi.");
	}
}
