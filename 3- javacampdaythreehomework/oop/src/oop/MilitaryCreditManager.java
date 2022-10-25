package oop;

public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void Calculate() {
		System.out.println("Military credit calculated");
		
	}

}