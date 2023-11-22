import javax.swing.*;
public class Example1 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		//input and convert data from dialog box
		int numberofCustomer = Integer.parseInt(
				JOptionPane.showInputDialog("How many customer per bill"));
        double priceAfterDiscount , totalPrice = 0;
        //Calculate total price of buffet
        totalPrice = BUFFET * numberofCustomer;
        //using showMessage dialog box for display totalPrice
        /*JOptionPane.showMessageDialog(null, "Amountto be paid is"
        		+totalPrice +" baht.");*/
        //using Confirm dialog box
        int memberCard;
        do {
        	memberCard = JOptionPane.showConfirmDialog(null,
               	 "Total price is "+totalPrice+" baht."+
               	 "\nDo you have a member card?");
        }while(memberCard==JOptionPane.CANCEL_OPTION);
        
        if(memberCard==JOptionPane.YES_OPTION) {
        	priceAfterDiscount = totalPrice *90/100;//discount 10%
        	JOptionPane.showMessageDialog(null, "Amountto be paid is"
            		+priceAfterDiscount +" baht.");
        }//end of if
        else if(memberCard==JOptionPane.NO_OPTION) {      	
        	JOptionPane.showMessageDialog(null, "Amountto be paid is"
            		+totalPrice +" baht.");
        }
        
        
	}

}
