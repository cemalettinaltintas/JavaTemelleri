package switchDemo;

public class Main {

	public static void main(String[] args) {
		// mesajYaz();
		char harf = 'Ü';
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın harf");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("İnce harf");
			break;

		default:
			System.out.println("Geçersiz harf");
			break;
		}
	}

	private static void mesajYaz() {
		char grade = 'F';
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz.");
			break;
		case 'B':
			System.out.println("Çok güzel : Geçtiniz.");
			break;
		case 'C':
			System.out.println("İyi : Geçtiniz.");
			break;
		case 'D':
			System.out.println("Fena değil : Geçtiniz.");
			break;
		case 'F':
			System.out.println("Maalesef kaldınız.");
			break;
		default:
			System.out.println("Geçersiz giriş.");
			break;
		}
	}

}
