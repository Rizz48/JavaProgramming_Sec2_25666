import java.util.Scanner;
import java.io.*;
public class Lab1204 {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		BufferedReader read = new BufferedReader(new FileReader("D://txtfile//BookData.txt"));
		System.out.print("Enter rating of books : ");
		double inputRate = input.nextDouble();
		System.out.println("---------------------------------------------------------------------------------");
		String temp = "";
		int i = 1;
		int num = 0;
		while((temp = read.readLine()) != null) {
			String[] data  = temp.split("\t");
			String title = data[0];
			String author = data[1];
			double rating = Double.parseDouble(data[2]);
			int review = Integer.parseInt(data[3]);
			if(rating >= inputRate) {
				System.out.println("Book "+i+":"+title+" write by "+author+" ("+review+") reviews");
				num++;
			}
			i++;
		}
		read.close();
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("There are "+num+" book get rating more than "+inputRate);
	}

}
