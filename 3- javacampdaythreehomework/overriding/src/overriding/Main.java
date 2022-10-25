package overriding;

public class Main {

	public static void main(String[] args) {
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		var result = ogretmenKrediManager.hesapla(10000);
		System.out.println(result);
		
		BaseKrediManager[] krediManagers = new BaseKrediManager[] {new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};
		
		for (BaseKrediManager krediManager : krediManagers)
		{
			System.out.println(krediManager.hesapla(15000));
		}
	}
}