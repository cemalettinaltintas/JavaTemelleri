package arrayDemo;

import java.util.Iterator;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
//		String[][] sehirler=new String[3][3];
//		
//		sehirler[0][0]="İstanbul";
//		sehirler[0][1]="Bursa";
//		sehirler[0][2]="Kocaeli";
//		
//		sehirler[1][0]="Konya";
//		sehirler[1][1]="Kayseri";
//		sehirler[1][2]="Ankara";
//		
//		sehirler[2][0]="Trabzon";
//		sehirler[2][1]="Tokat";
//		sehirler[2][2]="Zonguldak";
//		
//		
//		for (int i = 0; i <3; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.println(sehirler[i][j]);
//			}
//			System.out.println("---------");
//		}
	
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.println(sehirler[i][j]);
//			}
//			System.out.println("-----");
//		}
		
// Verilen kare matrisin köşegenlerini toplatınız.
		int[][] numbers= {
						{1,2,3,4},
						{2,6,9,8},
						{7,2,5,7},
						{0,2,3,55}
		};
		
		int top=0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (i==j || i+j==3) {
					top+=numbers[i][j];
				}
			}
		}
		System.out.println(top);
	}
}
