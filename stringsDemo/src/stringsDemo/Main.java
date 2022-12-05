package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String name = "Mustafa Kemal";
		System.out.println(name.length());
		System.out.println(name.charAt(8));
		System.out.println(name.concat(" Atatürk"));
		System.out.println(name.startsWith("M"));
		System.out.println(name.endsWith("y"));
		
		char[] karakterler=new char[7];
		name.getChars(0, 7, karakterler,0);
		System.out.println(karakterler);
		
		System.out.println(name.indexOf("a"));
		System.out.println(name.lastIndexOf("a"));
		System.out.println(name.replace(" ", "-"));
		System.out.println(name.substring(8));
		System.out.println(name.substring(4,6));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.trim());
	}

}
