import java.text.DecimalFormat;
import java.util.*;
import java.util.Scanner;
public class Exmple3 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner console = new Scanner(System.in);
		System.out.print("Input product name : ");
		String productName = console.nextLine();
		System.out.print("Input product unit : ");
		int productUnit = console.nextInt();
		System.out.print("Input price per unit : ");
		float pricePerUnit = console.nextFloat();
		System.out.println();//เว้น 1 บรรทัด
		double totalprice = productUnit*pricePerUnit;
		System.out.println("Total Price is "+frm.format(totalprice)+" baht.");
		double vat = totalprice+(totalprice*7/100);
		System.out.println("Add vat 7% is "+frm.format(vat)+" baht.");

	}

}
