package LeetCodePrectice;

public class TwoSum {
		public static int[] twoSum(int[] nums, int target) {
			int res[]=new int[2];
			for (int i = 0; i < nums.length; i++) {
				for (int j = 1; j < nums.length; j++) {
					
					if (i==j) {
						break;
					}
					if ((nums[i] + nums[j]) == target) {
						res[0] = i;
						res[1] = j;
						//res[2] = 0;
					}
				}
			}
			return res;
		}
	public static void main(String[] args) {
		
		int nums[] = new int[]{3,3};
		//call method 
		
		int res[]=twoSum(nums, 6);
		for (int i : res) {
			System.out.println(i);
		}
		 
	}
}
