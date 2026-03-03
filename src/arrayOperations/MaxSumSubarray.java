package arrayOperations;

public class MaxSumSubarray {
	
	/* arr = {2,1,5,1,3,2}; 
	 * int k=3;
	 * {2,1,5} --> 8
	 * {1,5,1} --> 7
	 * {5,1,3} --> 9 -- <.>
	 * {1,3,2} --> 6
	 */
	
	public static int maxSumSubArray(int[]arr, int k) {
		int maxSum = 0; // Store maximum sum
		int sum = 0; // store current sum
		int start = 0; // starting index
		
		for(int end=0; end<arr.length; end++) {
			sum += arr[end];
			
			if(end >= k-1) {
				maxSum = Math.max(maxSum, sum);
				sum -= arr[start];
				start++;
			}
		}
		
		return maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,5,1,3,2}; 
		int k = 3;
		int maxSum = maxSumSubArray(arr, k);
		System.out.println("Maximum sum of subarray of size '" + k + "' is: " + maxSum);
		
		int l = 4;
		int result = maxSumSubArray(arr, l);
		System.out.println("Maximum sum of subarray of size '" + l + "' is: " + result);
	}

}
