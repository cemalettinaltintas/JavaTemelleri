package interfaceDemo;

public class Main {

	public static void main(String[] args) {
		Worker ali=new Worker();
		ali.work();
		ali.pay();
		
		OutsourceWorker ahmet=new OutsourceWorker();
		ahmet.work();
		
		IWorkable oguz=new Worker();
		IWorkable sude=new OutsourceWorker();
	}

}
