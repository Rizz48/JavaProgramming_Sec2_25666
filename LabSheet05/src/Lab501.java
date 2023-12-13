import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		System.out.print("Full Name: ");
		String fullName = scan.nextLine();
		int countSpace = fullName.indexOf(" ");
		
		
		if(countSpace == -1) {
			System.out.println("Incorrect Name");			
		}else{
			System.out.println("Frist Name: "+fullName.substring(0,countSpace).toUpperCase());	
			System.out.println("Last Name: "+fullName.substring(countSpace+1).toLowerCase());
		}	
		

	}

}
