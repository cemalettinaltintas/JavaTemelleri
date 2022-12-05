package oopIntro;

public class Main {

	public static void main(String[] args) {
		//OOP : Object Oriented Programming
		Product product1=new Product("Asus",29000,20,10,"1.jpg");//referans-instance-ornek alma
		
		Product product2=new Product();
		product2.setName("Dell");
		product2.setUnitPrice(30000);
		product2.setUnitsInStock(30);
		product2.setDiscount(5);
		product2.setImageUrl("2.jpg");
		
		Product product3=new Product();
		product3.setName("Lenovo");
		product3.setUnitPrice(25000);
		product3.setUnitsInStock(-50);
		product3.setDiscount(20);
		product3.setImageUrl("3.jpg");

		Product[] products= {product1,product2,product3};
		for (Product product : products) {
			System.out.println(product.getName()+" - "+product.getUnitPrice()+" - "+ product.getDiscount()
			+"  - "+product.getUnitPriceAfterDiscount());
		}
		
		//Inheritance - Miras
		System.out.println("----------");
		
		IndividualCustomer individualCustomer=new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("123456");
		individualCustomer.setPhone("05351232323");
		individualCustomer.setFirstName("Alp");
		individualCustomer.setLastName("Çelik");
		
		CorporationCustomer corporationCustomer=new CorporationCustomer();
		corporationCustomer.setId(2);
		corporationCustomer.setCustomerNumber("99999");
		corporationCustomer.setPhone("02121234556");
		corporationCustomer.setCompanyName("Amazon");
		
		SendikaCustomer sendikaCustomer=new SendikaCustomer();
		sendikaCustomer.setCustomerNumber("7777");
		sendikaCustomer.setId(3);
		sendikaCustomer.setPhone("05354561221");
		
		Customer[] customers= {individualCustomer,corporationCustomer,sendikaCustomer};
		
		for (Customer customer : customers) {
			System.out.println(customer.getId() +" : "+customer.getCustomerNumber());
		}
		System.out.println("----------");
		
		Category category1=new Category(1, "Elektronik");
		Category category2=new Category(2, "Moda");
		
		
		Category[] categories= {category1,category2};
		
		for (Category category : categories) {
			System.out.println(category.getName());
		}
		
		System.out.println("----------");
		
		ProductManager productManager=new ProductManager();
		productManager.addToCart(product1);
		System.out.println("----------");
		
		CustomerManager customerManager=new CustomerManager();
		//customerManager.add(sendikaCustomer);
		customerManager.addMultiple(customers);
		
	}

}
