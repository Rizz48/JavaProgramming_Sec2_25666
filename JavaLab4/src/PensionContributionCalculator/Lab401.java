package PensionContributionCalculator;
import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		int x,y,sum;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Value of X : ");
		x = scan.nextInt();	
		System.out.print("Input Value of Y : ");
		y = scan.nextInt();
		while(y<=x) {
			System.out.print("Input Value of Y, again : ");
			y = scan.nextInt();				
		}
		sum=x;
		for(int i=x+1;i<=y;i++) {
			sum=x+i;
			System.out.println(x+" + "+i+" =  "+(sum));
			x=sum;
			
			
		}
		
	  }
	
	}

