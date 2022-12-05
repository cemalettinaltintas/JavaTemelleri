package recapDemo2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Giris {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Vize notunuz :");
		int vize=scanner.nextInt();
		System.out.print("Final notunuz :");
		int fnl=scanner.nextInt();
		double ort=vize*0.4+fnl*0.6;
		System.out.println("Ortalamanız :"+ort);
//		String kadi=JOptionPane.showInputDialog("Kullanıcı adını giriniz :");
//		JOptionPane.showMessageDialog(null, kadi+" Hoş geldin!");
		
	}

}
