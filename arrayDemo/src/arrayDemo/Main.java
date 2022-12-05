package arrayDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1="Hüseyin";
		String ogrenci2="Burak";
		String ogrenci3="Alp";
		String ogrenci4="Ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("--------");	
//		String[] ogrenciler=new String[4];
//		ogrenciler[0]="Hüseyin";
//		ogrenciler[1]="Burak";
//		ogrenciler[2]="Alp";
//		ogrenciler[3]="Ahmet";
		
		String[] ogrenciler= {"Hüseyin","Burak","Alp","Ahmet"};
		
//		System.out.println(ogrenciler[0]);
//		System.out.println(ogrenciler[1]);
//		System.out.println(ogrenciler[2]);
		
//		for (int i = 0; i < ogrenciler.length; i++) {
//			System.out.println(ogrenciler[i]);
//		}
		
		//foreach
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		
	
	}

}
