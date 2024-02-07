import java.util.*;
import java.io.*;
public class Lab1201 {

	public static void main(String[] args) throws IOException{
		Scanner read = new Scanner(new File("D://txtfile//MemberLogin.txt"));
		while(read.hasNext()) {
			String Fname = read.next();
			String Lname = read.next();
			read.next();
			String Email = read.next().toUpperCase();
			String SubName = Lname.substring(0,1).toUpperCase();
			System.out.println(SubName+"."+Fname+" ("+Email+")");
		}
		read.close();

	}

}
