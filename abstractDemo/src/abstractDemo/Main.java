package abstractDemo;

public class Main {

	public static void main(String[] args) {
		ManGameCalculator man=new ManGameCalculator();
		man.hesapla();
		man.gameOver();

		WomanGameCalculator women=new WomanGameCalculator();
		women.hesapla();
		
		KidsGameCalculator kids=new KidsGameCalculator();
		kids.hesapla();
		//abstract classlar newlenemez.
		
		//GameCalculator calc=new GameCalculator() {

	}
}
