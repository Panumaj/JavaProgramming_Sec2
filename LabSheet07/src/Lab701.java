
public class Lab701 {

	public static void main(String[] args) {
		int [] nums = { 12,50,93,45,75,52,80};
		/*for(int i = 0 ; i<nums.length;i++) {
			System.out.println("nums["+i+"] = "+nums[i]);
		}
		System.out.println("Using foreach ");
		int j = 0;
		for (int _nums : nums) {
			System.out.println("nums["+j+"] = "+_nums);
		j = j+1;
		}*/
		printArray(nums);
	}//end of Main method
	public static void printArray(int[] _num) {
		for(int i = 0 ; i<_num.length;i++) {
			System.out.println("nums["+i+"] = "+_num[i]);
		}
	}

}
