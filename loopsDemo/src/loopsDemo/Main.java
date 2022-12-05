package loopsDemo;

public class Main {

	public static void main(String[] args) {	
		//For
		for (int i = 0; i < 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For düngüsü bitti.");
		
		//while
		int j=0;
		while (j<10) {
			System.out.println(j);
			j+=2;
		}
		System.out.println("While düngüsü bitti.");
		
		//Do-while
		int x=0;
		do {
			System.out.println(x);
			x+=3;
		} while (x<10);
	}

}
