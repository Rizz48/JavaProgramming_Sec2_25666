import java.util.*;
import java.io.*;
public class SaveandOpen extends Employee{
	private String name;
	private String dept;
		
	public void insert() throws IOException{
		// create object for input data from keyboard(console)
		Scanner scan = new Scanner(System.in);
		// create object for write data to file using printStrem Class
		PrintStream writeFile = new PrintStream(new File("d://txtFile//employee.txt"));	
		String answer;
		do {
			header();// call header() method from Class Employee
			System.out.print("Enter name:");
			name = scan.next();
			System.out.print("Enter department:");
			dept = scan.next();	
			//Save all data to file
			writeFile.println(name+"\t"+dept);
			System.out.print("Enter data again? :");
			answer = scan.next().toLowerCase();
		}while(answer.equals("y"));		
	}
	
	public void read() {		
		try {
			int i = 0;
			//create object for read File using Scanner Class
			Scanner readFile = new Scanner(new File("d://txtFile//employee.txt"));
			boolean check = false;
			header();
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getdept())) {
					i++;
					System.out.println(i+")"+name);
					check = true;					
				}
			}
			if(check==false) {				
				System.out.println("\nSorry, no department: "+super.getdept()+" in File");
			}
			else {
				header();
				System.out.println("Employee in dept "+super.getdept()+" is "+i+" person.");
			}
		}catch(IOException e) {
			System.out.println("\nSorry, file not found...");
		}
	}


}
