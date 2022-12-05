package arrayDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		int[] numbers=new  int[3];
		numbers[0]=2;
		numbers[1]=7;
		numbers[2]=6;
		
		for (int i : numbers) {
			System.out.println(i);
		}
		
		System.out.println("------------------");
		
//		List<Integer> sayilar = new ArrayList<>();
//		sayilar.add(2);
//		sayilar.add(7);
//		sayilar.add(6);
//		sayilar.add(33);
//		sayilar.add(6);
//		sayilar.remove(4);
//		for (Integer sayi : sayilar) {
//			System.out.println(sayi);
//		}
		
		List<String> ogrenciler=new ArrayList<>();
		ogrenciler.add("yakup");
		ogrenciler.add("emircan");
		ogrenciler.add("alper");

		//ogrenciler.clear();
		if (ogrenciler.contains("alper")) {
			System.out.println("Alper bulundu");
		}else {
			System.out.println("Alper dizide yok.");
		}
		
		if (ogrenciler.size()==0) {
			System.out.println("Liste bos.");
		}
		
		//System.out.println(ogrenciler.get(2));
		
		
	}

}
