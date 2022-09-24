package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.Hesapla();
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(ogretmenKrediManager);
		
		KrediUI krediUI2 = new KrediUI();
		krediUI2.KrediHesapla(new OgretmenKrediManager());
		
		

	}

}
