
public class Main {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch (grade) {
		case 'A':
			System.out.println("mükemmel geçtiniz");
			break;
		case 'B':
		case 'C':
			System.out.println("fena değil geçtiniz");
			break;
		case 'D':
			System.out.println("mükemmel geçtiniz");
			break;
		case 'F':
			System.out.println("maalesef kaldınız.");
			break;
		default:
			System.out.println("geçersiz not.");
		}

	}

}
