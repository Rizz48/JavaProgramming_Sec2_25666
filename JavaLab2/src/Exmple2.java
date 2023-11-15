import java.text.*;//1. import library for format number
public class Exmple2 {

	public static void main(String[] args) {
		//2. define object call DecimalFormat Class
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		final int BUFFET = 299;
		int numberofCustomer = 5;
		
		float totalPrice = BUFFET * numberofCustomer;
		//3. apply frm odject to totalPrice
		System.out.println("Buffet of "+numberofCustomer+" customer is "+frm.format(totalPrice));
		float serviceCharge = totalPrice + (totalPrice*3/100);
		System.out.println("Add Service Charge 3% is "+frm.format(serviceCharge));

	}

}
