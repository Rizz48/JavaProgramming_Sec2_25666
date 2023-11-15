import java.text.DecimalFormat;

import javax.swing.*;//1. import library for input data from dialog box
public class Exmple4 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//2. Display and input data from dialog box
		String productName = JOptionPane.showInputDialog("Input product name :");
		
		/*String strUnit = JOptionPane.showInputDialog("Input product unit: ");
		//convert string to int
		int unitPrice = Integer.parseInt(strUnit);*/
		
		int unitPrice = Integer.parseInt(JOptionPane.showInputDialog("Input product unit: "));
		float pricePerUnit = Float.parseFloat(JOptionPane.showInputDialog("Input Price per unit: "));
		
		double totalprice = unitPrice*pricePerUnit;
		double vat = totalprice+(totalprice*7/100);
		
		//show message from dialog box
		JOptionPane.showMessageDialog(null, "Total price is "+frm.format(totalprice)+" baht."
				+"\nAdd VAT 7% is "+frm.format(vat)+" baht.");
		
		
	}

}
