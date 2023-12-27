import java.util.*;
import java.text.*;
public class Lab702 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		double a = 0;
		double[] student = new double [5];
		DecimalFormat frm = new DecimalFormat("#.00");
		
		for(int i = 0;i<student.length;i++) {
			System.out.print("Input score of student "+(i+1)+" :");
			student[i] = scanner.nextDouble();
			a += student[i]/student.length;
		}
		System.out.println();
		System.out.println("Average of "+ student.length+ " student is "+ frm.format(a));
		for(int i = 0 ; i < student.length;i++) {
			if(student[i] > a) {
				System.out.println("Student "+ (i+1) + " ("+frm.format(student[i])+")");
			}
		}
		
		
		
		
		
		
		

	}

}
