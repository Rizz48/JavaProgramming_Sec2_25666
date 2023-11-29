package PensionContributionCalculator;
import java.util.*;
import java.text.DecimalFormat;
public class SalespersonSalary {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		// Declare constants
		 final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1; // Terminating value for input
		 Scanner scan = new Scanner(System.in);
		 // Declare variables
		 int sales; // Input gross sales
		 double salary; // Salary to be computed
		 while(true) {
		 System.out.print("Enter sales in dollars (or -1 to end): ");
		 sales = scan.nextInt();
		 if(sales==SENTINEL) {
			 System.out.print("bye");
			 break;
		 }
		 salary = sales*COMMISSION_RATE+1000;
		 System.out.println("Salary is: "+frm.format(salary));
		 }
	}

}
