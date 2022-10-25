package oop;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void Calculate() {
		System.out.println("öğretmen kredisi hesaplandı");
		
	}
}
