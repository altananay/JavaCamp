package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "altan";
		String ogrenci2 = "altan";
		String ogrenci3 = "altan";
		String ogrenci4 = "altan";
		String ogrenci5 = "altan";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		System.out.println(ogrenci5);
		
		System.out.println("-------------------------");
		
		
		String[] ogrenciler = new String[4];
		
		ogrenciler[0] = "altan";
		ogrenciler[1] = "altan";
		ogrenciler[2] = "altan";
		ogrenciler[3] = "altan";
		
		for(int i=0; i<ogrenciler.length; i++)
		{
			System.out.println(ogrenciler[i]);
		}
		
		for (String ogrenci:ogrenciler)
		{
			System.out.println(ogrenci);
		}
	}

}
