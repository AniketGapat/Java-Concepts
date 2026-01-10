package arrayOperations;

import java.util.Arrays;

public class arrayOp {
	
	static int arr[] = new int[5];
	
	public static void printArr() {
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//printing array elements
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("");
		
		//for each loop
		for(int i:arr) {
			System.out.println(i);
		}
	}
	
	//printing minium value
	public static void printMin(int a[]) {
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(min>a[i]) {
				min = a[i];
			}
		}
		System.out.println("min value : "+min);
		
		Arrays.sort(a);
		System.out.println("Sorted array is: ");
		for(int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		//int array to string array conversion
		String strArr= Arrays.toString(arr);
		System.out.println("int array to string array"+strArr);
		
		System.out.println("Fourth item of array : "+arr[3]);
		
		//copying range of array into other array
		int newArr[] = Arrays.copyOfRange(arr, 0,3);
		/*System.out.println("new array:");
		for(int i:newArr)
			System.out.println(i);*/
	}
	
	public static void arrSort(int arr[]) {
		System.out.println("Sorted array is:");
		for(int i=0;i<arr.length;i++) {
			int temp = 0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArr();
		int array[]={43,57,18,24,213,78,23};
		printMin(array);
		arrSort(array);
	}

}
