package recapDemo2;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// Ödev 2: Kendisi hariç bölenleri toplamı birbirine eşit olan sayılara arkadaş sayılar denir. 
		// 220 ve 284 sayıları arkadaş sayılardır.
		// Buna göre verilen iki sayının arkadaş sayı olup olmadığını bulan kodları yazınız.
		
		//isPrime();
		//isPerfectNumber();
		
		int sayi1=220;
		int sayi2=284;
		int total1=0;
		int total2=0;
		
		for (int i =1 ; i < sayi1; i++) {
			if (sayi1%i==0) {
				total1+=i;
			}
		}
		for (int i =1 ; i < sayi2; i++) {
			if (sayi2%i==0) {
				total2+=i;
			}
		}
		if (sayi1==total2 && sayi2==total1) {
			System.out.println("These numbers are friends.");
		}else {
			System.out.println("These numbers are not friends.");
		}
	}

	private static void isPerfectNumber() {
		// Ödev 1: Pozitif bölenleri toplamı kendisine eşit olan sayılara mükemmel sayı denir.
		// 6 -->1,2,3
		// 28 -->1,2,4,7,14
		// Verilen bir sayının mükemmel sayı olup olmadığını bulan java kodlarını yazınız.
		int number=28;
		int total=0;
		for (int i = 1; i <number; i++) {
			if (number%i==0) {
				total+=i;
			}
		}
		if (number==total) {
			System.out.println(number+" is a perfect number.");
		}else {
			System.out.println(number+" is not a perfect number.");
		}
	}

	private static void isPrime() {
		int number=3;
		boolean asalMi=true;
		
		if (number==1) {
			System.out.println("Asal değildir.");
			return;
		}
		if (number<2) {
			System.out.println("Pozitif bir sayı girişi yapılmalıdr.");
			return;
		}
		
		for (int i = 2; i < number; i++) {
			if (number%i==0) {
				asalMi=false;
			}
		}
		if (asalMi) {
			System.out.println("Asaldır.");
		}else {
			System.out.println("Asal değildir.");
		}
	}

}
