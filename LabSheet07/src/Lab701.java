import java.util.Scanner;

public class Lab701 {

	public static void main(String[] args) {
		int[] nums = new int [7];
		int i = 0;
		int oddNumber = 0;
		int odd = 0;
		Scanner scanner = new Scanner(System.in);
		for(int num:nums) {
			System.out.print("Input number "+(i+1) +":");
			nums[i] = scanner.nextInt();			
			if(nums[i] % 2 !=0) {
				oddNumber++;
			}
			i++;
		}
		
			
		System.out.println();
		System.out.println("There are"+ oddNumber  +"of odd number.");
		System.out.print("List of odd number : ");
		for(int v:nums) {
			if(v % 2 !=0) {
				System.out.print(v+" ");
			}
		}
			
		

	}

}
