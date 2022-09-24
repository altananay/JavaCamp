package loopDemo;

public class Main {

	public static void main(String[] args) {
		for(int i = 0; i<10; i+=2)
		{
			System.out.println(i);
		}

		System.out.println("döngü bitti");
		
		int i = 2;
		while (i<10) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println("while bitti");
		
		int j = 100;
		do {
			System.out.println("loglandi");
			System.out.println(j);
			j+=2;
		} while (j<10);
		
		System.out.println("do while bitti");
		
	}

}
