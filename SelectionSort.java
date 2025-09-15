package Sorting_Searching;

public class SelectionSort {

	public static void selectionSort (int arr[]) {
	    
	    int size = arr.length;

	    for (int i = 0; i < size - 1; i++) {

	      int min = i;
	      for (int j = i + 1; j < arr.length; j++) {
	        if (arr[j] < arr[min]) {
	          min = j;
	        }
	      }

	      int temp = arr[min];
	      arr[min] = arr[i];
	      arr[i] = temp;
	  }
	
		
		System.out.println("Sorted Array: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
	// int minimumValue =

	public static void main(String[] args) {
		int[] nums = { 2, 5, -7, 2, -9, 3, -6, -199, 10, 6, 8, 3, 199, 166, 900, 23, 50, -50, -23, 1900000082,-1900000082, 1, 0, -1, -2 };
		System.out.println("Sorting the Array... ");
		System.out.println(" ");
		selectionSort(nums);

	}

}
