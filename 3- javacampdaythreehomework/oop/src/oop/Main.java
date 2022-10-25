package oop;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3};
		int[] sayilar2 = {2,3,4};
		
		sayilar1 = sayilar2;
		
		sayilar2[0] = 1000;
		
		System.out.println(sayilar2[0]);
		
		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Calculate();
		
		Customer customer = new Customer();
		
		customer.Id = 1;
		customer.City = "kuşadası";
		
		creditManager.Save(customer);
		
		CustomerManager customerManager = new CustomerManager(customer, new MilitaryCreditManager());
		customerManager.Save();
		customerManager.GiveCredit();
		Company company = new Company();
		company.TaxNumber = "10000";
		company.CompanyName = "arçelik";
		company.Id = 100;
		
		Person person = new Person();
		person.FirstName = "altan";
		person.NationalIdentity= "12345";
		
		CustomerManager customerManager2 = new CustomerManager(company, new TeacherCreditManager());
		customerManager2.GiveCredit();
		Customer c1 = new Customer();
		Customer customer2 = new Company();
		Customer customer3 = new Person();
		
		
		
		
	}

}