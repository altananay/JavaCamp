package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'I';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harfler");
			break;
		default:
			System.out.println("İnce sesli harf");

		}
	}

}
