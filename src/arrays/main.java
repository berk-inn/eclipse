package arrays;

public class main {

	public main(String[] args) {
		
		String ogrenci1 = "Berk";
		String ogrenci2 = "inan";
		String ogrenci3 = "Buket";
		String ogrenci4 = "Leyla";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		System.out.println("******************");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Berk";
		ogrenciler[1] = "inan";
		ogrenciler[2] = "Buket";
		ogrenciler[3] = "Leyla";
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("***************");
		//alttaki farklı bir yazdırma yöntemi
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
