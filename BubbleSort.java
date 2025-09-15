package Sorting_Searching;

public class BubbleSort {
	
	
	public static void bSort(int arr[]) {
		int size = arr.length-1;
		
		for(int i = 0; i<size; i++) {
			for(int j = 0; j<size-i; j++) {
				
				if(arr[j] > arr[j+1]) {
					int holdValue = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = holdValue;
				}
			}
		}
		
		System.out.println("Sorted Array: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
	}

	public static void main(String[] args) {
		int[] nums = {2,5,-7,2,-9,3,-6,8,3,6,8,3};
		
		System.out.println("Sorting the Array... ");
		System.out.println(" ");
		bSort(nums);
		
		
	}

}
