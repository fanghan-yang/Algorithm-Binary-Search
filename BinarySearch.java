import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int nums[] = {1, 94, 2, 4, 92, 6, 13, 19, 21, 41, 3, 11, 78};
		int target = 4;
		BS bs = new BS();
		int pos = bs.binarySearch(nums, target);
		System.out.println(pos);
	}

}

class BS {
	/**
	 * @param nums: The integer array.
	 * @param target: Target to find.
	 * @return: The first position of target. Position starts from 0.
	 */
	public int binarySearch(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
    		return -1;
    	}
		// sort before search
		Arrays.sort(nums);
		
		int start = 0, end = nums.length - 1;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				end = mid;			// find the first position
			}
			else if (nums[mid] < target) {
				start = mid;
			}
			else {
				end = mid;
			}
		}
		
		// find the first position
		if (nums[start] == target) {
			return start;
		}
		if (nums[end] == target) {
			return end;
		}
		return -1;
	}
}
