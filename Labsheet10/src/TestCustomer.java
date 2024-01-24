
public class TestCustomer {

	public static void main(String[] args) {
		System.out.println("###Test Customer class###");
		 customer c1 = new customer(1088, "Conan Edogawa", 10);
		 
		// Customer's toString()
		System.out.println(c1);
		
		// set customer's discount is 5
		c1.setDiscount(5);
		
		// Customer's toString()
		System.out.println(c1);
			
			
		Line();
		// show customer's
		System.out.println("ID is : "+c1.getID());
		
		// show customer's name
		System.out.println("Name is : "+c1.getName());
		
		// show customer's discount
		System.out.println("discount is : "+c1.getDiscount());
			
			
		Line();
		System.out.println("###Test Invoice class###");
		Invoice invl = new Invoice(101, c1, 12000.00);
		
		// Invoice's toString()
		System.out.println(invl);
		
		// set invoice's amount is 10000
		invl.setAmount(10000);                  
		
		// Invoice's toString()
		System.out.println(invl);                
			
			
		Line();
		// show invoice's id
		System.out.println("ID is : "+invl.getID());
		
		// Customer's toString() by instance inv1
		System.out.println("Customer is : "+invl.getCustomer());
		
		// show invoice's amount
		System.out.println("Amount is : "+invl.getAmount());
			
			
		Line();
		// show customer's id by instance inv1
		System.out.println("Customer's id is : "+invl.getCustomerID());
		
		// show customer's name by instance inv1
		System.out.println("Customer's name is : "+invl.getCustomerName());
		
		// show customer's discount by instance inv1
		System.out.println("Customer's discount is : "+invl.getCustomerDiscount());
		
		// show invoice's amount after discount(format as output)
		System.out.println("Amount after discount is : "+invl.getAmountAfterDiscount());     
	}

	public static void Line() {
		System.out.println("*".repeat(88));
	}


}
