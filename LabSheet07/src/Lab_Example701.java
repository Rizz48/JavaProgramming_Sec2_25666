
public class Lab_Example701 {

	public static void main(String[] args) {
		int[] nums = {12,50,93,45,75,52,80};
		for(int i = 0; i<nums.length; i++){
			System.out.println("nums["+i+"]="+nums[i]);
		}
		System.out.print("using foreach to dispiay value from array nums ");
		int j =0;
		for(int _number:nums) {
			System.out.println("nums["+j+"]="+_number);
			j=j+1;
		}
		printArray(nums);//method no return	
		
	}//end of main
	
	public static void printArray(int[] _num) {
		System.out.println("using method to dispiay value from array _nums ");
		for(int i = 0; i<_num.length; i++) {
			System.out.println("nums["+i+"]="+_num[i]);
		}
						
	}//end of printArray

}
