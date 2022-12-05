package interfaceDemo;

public class Worker extends Test implements IWorkable,IEatable,IPayable{

	@Override
	public void work() {
		System.out.println("Worker worked");		
	}

	@Override
	public void eat() {
		System.out.println("Worker ate");	
	}

	@Override
	public void pay() {
		System.out.println("Worker paid");	
	}

}
