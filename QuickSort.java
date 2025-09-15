package Sorting_Searching;

public class QuickSort {

	private static void quickSort(int[] arr, int startIndex, int endIndex) {

		if (endIndex <= startIndex) {
			return;
		}

		int pivot = split(arr, startIndex, endIndex);
		quickSort(arr, startIndex, pivot - 1);
		quickSort(arr, pivot + 1, endIndex);
	}

	private static int split(int[] arr, int startIndex, int endIndex) {

		int pivot = arr[endIndex];
		int i = startIndex - 1;

		for (int j = startIndex; j <= endIndex; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = arr[endIndex];
		arr[endIndex] = temp;

		return i;
	}

	public static void main(String args[]) {

		int[] array = {8, 2, 5, 3, 4, 7, 6, 1, -8, -10, -2932, 1823, 123, -749, -1283, 0, 0, 19823};
		quickSort(array, 0, array.length - 1);
		for (int i : array) {
			System.out.print(i + ", ");
		}

	}

}
