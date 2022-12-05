package oopIntro;

public class CustomerManager {
	
	//Polymorphism
	public void add(Customer customer) {
		System.out.println(customer.getCustomerNumber());
	}
	
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
	}
}
