package arrayOperations;

public class RotatedSortedArray {

	// Rotated sorted array is initially sorted in increasing order but then rotated
	// at pivot point eg - {6,7,9,15,19,2,3} was originally {2,3,6,7,9,15,19} but rotated
	
	public static void main(String[] args) {
		int[] arr = {6, 7, 8, 9, 1, 2, 3, 4, 5};
		int[] targets = {9, 3, 10};
        for (int target : targets) {
            int index = search(arr, target);
            if (index != -1)
                System.out.println("Element " + target + " found at index: " + index);
            else
                System.out.println("Element " + target + " not found in array.");
        }
	}
	
	public static int search(int[] arr, int target) {
		int low = 0;
		int high = arr.length-1;
		
		while(low <= high) {
			int mid = low + (high - low)/2;
			
			if(arr[mid]== target) {
				return mid;
			}
			
			//determine whether the right or left side of array is sorted
			//left half is sorted
			if(arr[low] < arr[high]) {
				if(target>=arr[low] && target<arr[mid]) {
					high = mid - 1;
				}else {
					low = mid + 1;
				}
			}
			//right half is sorted
			else {
				if(target>arr[mid] && target<= arr[high]) {
					low = mid + 1;
				}else {
					high = mid - 1;
				}
			}
		}
		
		return -1;
	}

}
