package recap;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int not = 55;
		int kredi = 10000;
		double notOrtalamasi = 50.5;
		String isim = "altan";
		boolean sistemeGirdiMi = true;

		System.out.println(not);

		if (not >= 50) {
			System.out.println("geçti");
		} else if (not >= 40) {
			System.out.println("bütünleme");
		} else {
			System.out.println("kaldı");
		}

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		int sayi = 10;
		while (sayi <= 100) {
			System.out.println(sayi);
			sayi = sayi + 10;
		}

		int sayi2 = 11;
		do {
			System.out.println(sayi2);
			sayi2 = sayi2 + 10;
		} while (sayi2 > 100);

		String urun = "laptop";

		for (int i = 0; i < 10; i++) {
			System.out.println(urun);
		}

		System.out.println(topla(6, 3));

		System.out.println(toplananIkiSayininYuzdeOnu(10, 90));

		String[] sehirler1 = new String[] { "ankara", "istanbul", "izmir" };

		sehirler1 = new String[4];
		sehirler1[3] = "bursa";

		System.out.println(sehirler1[3]);

		int sayi3 = 10;
		int sayi4 = 20;
		sayi3 = sayi4;
		sayi4 = 30;
		System.out.println(sayi3);

		for (String sehir : sehirler1) {
			System.out.println(sehir);
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(sehirler1[i]);
		}

		int sayilar[] = { 1, 2, 3, 5, 6, 9 };
		int aranacak = 15;

		boolean varMi = sayiBul(sayilar, aranacak);

		mesajVer(varMi, aranacak);

		class Product {
			private String name;
			private String description;
			private double price;

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		Product product = new Product();

		product.setName("laptop");

		Product product2 = new Product();

		product2.setName("pc");

		Product[] urunler = new Product[] { product, product2 };

		for (int i = 0; i < urunler.length; i++) {
			System.out.println(urunler[i].getName());
		}

		class CreditManager {
			public void calculate() {
				System.out.println("hesaplandı");
			}

			public void add() {
				System.out.println("eklendi kredi");
			}
		}

		CreditManager creditManager = new CreditManager();

		creditManager.add();
		creditManager.calculate();

		class MortgageManager extends CreditManager {
			public void calculate() {
				System.out.println("mortgage hesaplandı");
			}
		}

		MortgageManager mortgageManager = new MortgageManager();
		mortgageManager.add();
		mortgageManager.calculate();

		class VehicleManager extends CreditManager {
			public void calculate() {
				System.out.println("vehicle hesaplandı");
			}
		}
		
		CreditManager[] credits = new CreditManager[2];
		
		credits[0] = new MortgageManager();
		credits[1] = new VehicleManager();
		
		for(int i = 0; i<credits.length; i++)
		{
			credits[i].calculate();
		}
		
		ArrayList<CreditManager> credits2 = new ArrayList<CreditManager>();
		
		credits2.add(mortgageManager);

	}

	public static void mesajVer(boolean varMi, int arancak) {
		String mesaj = "";

		if (varMi) {
			mesaj = "sayi mevcut" + arancak;
			System.out.println(mesaj);
		} else {
			mesaj = "sayi yok " + arancak;
			System.out.println(mesaj);
		}
	}

	public static boolean sayiBul(int[] sayilar, int aranacak) {
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		return varMi;
	}

	public static int topla(int sayi1, int sayi2) {
		int toplam = sayi1 + sayi2;
		return toplam;
	}

	public static double toplananIkiSayininYuzdeOnu(int sayi1, int sayi2) {
		int toplam = topla(sayi1, sayi2);
		double sonuc = toplam * 10 / 100;
		return sonuc;
	}

}
