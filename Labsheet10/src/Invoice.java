
public class Invoice {
	
	private int id;
	private customer Customer;
	private double amount;
	
	Invoice(int id, customer Customer, double amount){
		this.id = id;
		this.Customer = Customer;
		this.amount = amount;
	}
	
	public int getID() {
		return this.id;
	}
	
	public customer getCustomer() {
		return this.Customer;
	}
    
    public void setCustomer(customer Customer) {
    	this.Customer = Customer;;
    }
    
    public double getAmount() {
    	return this.amount;
    }
    
    public void setAmount(double amount) {
    	this.amount = amount;
    }
    
    public int getCustomerID() {
    	return this.getCustomer().getID();
    }
    
    public String getCustomerName() {
    	return this.getCustomer().getName();
    }
    
    public int getCustomerDiscount() {
    	return this.getCustomer().getDiscount();
    }
    
    public double getAmountAfterDiscount() {
    	return amount-amount*getCustomerDiscount()/100;
    }
    
    public String toString() {
    	return "Invoice"+"[id="+getID()+",Customer="+Customer+" ,amount= "+getAmountAfterDiscount();
    }

}
