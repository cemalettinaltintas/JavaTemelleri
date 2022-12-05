package recapDemo;

public class Main {

	public static void main(String[] args) {
		// 3 sayıyı karşılaştıran java kodlarını yazınız.
		int sayi1 = 100;
		int sayi2 = 90;
		int sayi3=80;
		int enBuyuk=sayi1;
		
		if (enBuyuk<sayi2) {
			enBuyuk=sayi2;
		}
		if(enBuyuk<sayi3) {
			enBuyuk=sayi3;
		}
		
		System.out.println(enBuyuk);

		
	}

}
