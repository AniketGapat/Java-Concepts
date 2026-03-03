package arrayOperations;

public class SearchElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 5, 10, 15, 20, 25 , 20};
		
		linearSearch(nums, 20);
		linearSearch(nums, 30);
	}

	private static void linearSearch(int[] array, int target) {
		// TODO Auto-generated method stub
		boolean found = false;
		for(int i=0; i<array.length; i++) {
			if(array[i] == target) {
				System.out.println("Target '" + target + "' found at index: " + i);
				found = true;
				// break; // If only first index needs to found then break this loop.
			}
		}
		if(!found){
			System.out.println("Element not found in array");
		}
	}

}
