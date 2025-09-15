package School;

public class RecursiveMethodsAT {

	/**
	 * 1. Recursively find and return the product of the first y whole numbers.
	 * 
	 * @param y
	 * @return y! as a long integer
	 * 
	 * @
	 */
	public static long factorial(int y) {
		if (y == 1) {
			return 1;
		}

		return factorial(y - 1) * y;
	}

	/**
	 * 2. Recursively find and return the sum of the first y whole numbers.
	 * 
	 * @param y
	 * @return sum as an int
	 */
	public static int sumInt(int y) {
		if (y <= 1) {
			return 1;
		}
		return y + sumInt(y - 1);
	}

	/**
	 * 3. Recursively finds the value of 2 to the yth power
	 * 
	 * @param y
	 * @return 2^y as a long integer
	 */
	public static long powerOfTwo(int y) {

		if (y == 0) {
			return 1;
		}

		return 2 * powerOfTwo(y - 1);
	}

	/**
	 * 4. Recursively find the nth term of the Fibonacci Sequence
	 * 1,1,2,3,5,8,13.......
	 * 
	 * @param n
	 * @return nth term as an int
	 */
	public static long fib(int n) {
		if (n <= 1) {
			return n;
		}

		return (fib(n - 1) + fib(n - 2));
	}

	/**
	 * 5. Recursively finds and returns the sum of the digits of n
	 * 
	 * @param n
	 * @return
	 */
	public static int sumDigits(int n) {
		int divideTen = 1;

		if (n == 0) {
			return 0;
		}

		divideTen = divideTen * 10;
		return n % divideTen + sumDigits(n / divideTen);

	}

	/**
	 * 6. Recursively find and return the reverse of a String s
	 *
	 * @param s
	 * @return the reverse of s
	 */
	public static String reverse(String s) {
		if (s.isEmpty()) {
			return s; // Base case: empt
		}

		return reverse(s.substring(1)) + s.charAt(0);
	}

	/**
	 * 7. Recursively finds the sum of the first y terms of the binary series (1/2 +
	 * 1/4 + 1/8 + ...).
	 *
	 * @param y the number of terms in the sequence
	 * @return the sum of the series as a double
	 */
	public static double binarySeries(int y) {
		if (y == 0) {
			return 0; // Base case: no terms to sum
		}
		return Math.pow(0.5, y) + binarySeries(y - 1); // Recursive case: current term + sum of remaining terms
	}

	/**
	 * 8. Recursively finds the maximum element of an array
	 *
	 * @param arr the array to search
	 * @return the maximum element in the array
	 */
	public static int findMax(int[] arr) {
		return maxValueHelper(arr, arr.length - 1);
	}

	private static int maxValueHelper(int[] arr, int index) {
		if (index == 0) {
			return arr[0];
		}
		return Math.max(arr[index], maxValueHelper(arr, index - 1));
	}

	/**
	 * 9. Recursively finds the sum of the elements of an int array
	 *
	 * @param arr the array to sum
	 * @return the sum of the elements in the array
	 */
	public static int findSum(int[] arr) {
		return findSumHelper(arr, arr.length - 1);
	}

	private static int findSumHelper(int[] arr, int index) {
		if (index < 0) {
			return 0;
		}
		return arr[index] + findSumHelper(arr, index - 1);
	}

	/**
	 * 10. Recursively finds the index of lookFor in an array
	 *
	 * @param arr     the array to search
	 * @param lookFor the value to find
	 * @return the index of lookFor or -1 if not found
	 */
	public static int search(int[] arr, int lookFor) {
		return searchHelper(arr, lookFor, 0);
	}

	private static int searchHelper(int[] arr, int lookFor, int index) {
		if (index >= arr.length) {
			return -1;
		}
		if (arr[index] == lookFor) {
			return index;
		}
		return searchHelper(arr, lookFor, index + 1);
	}

	/**
	 * 11. Recursively finds and returns the sum of a 2D array
	 *
	 * @param array the 2D array to sum
	 * @return the sum of the elements in the 2D array
	 */

	public static int sumOfArray(int[][] array) {
		return sumOfArrayHelper(array, 0, 0);
	}

	private static int sumOfArrayHelper(int[][] arr, int row, int col) {
		if (row >= arr.length) {
			return 0;
		}
		if (col >= arr[row].length) {
			return sumOfArrayHelper(arr, row + 1, 0);
		}
		return arr[row][col] + sumOfArrayHelper(arr, row, col + 1);
	}

	/**
	 * 12. Recursively fills a 2D array with the character c
	 *
	 * @param array the 2D array to fill
	 * @param c     the character to fill the array with
	 */

	public static void fillArray2(char[][] array, char c) {
		fillArrayHelper(array, c, 0, 0);
	}

	private static void fillArrayHelper(char[][] arr, char c, int row, int col) {
		if (row >= arr.length) {
			return;
		}
		if (col >= arr[row].length) {
			fillArrayHelper(arr, c, row + 1, 0);
		} else {
			arr[row][col] = c;
			fillArrayHelper(arr, c, row, col + 1);
		}
	}

	public static void main(String[] args) {

		System.out.println(" 20! " + factorial(20));

		System.out.println("Sum of first 16 Positive integers: " + sumInt(16));

		System.out.println("2^12: " + powerOfTwo(12));
		System.out.println("12th Fibonacci number: " + fib(12));
		System.out.println("Digit Sum of 12345: " + sumDigits(12345));
		System.out.println("RACECAR reversed: " + reverse("RACECAR"));
		System.out.println("Sum of 5 terms of binary Series: " + binarySeries(4));
		int[] x = { 1, 22, 133, 34, 56, 62, 79 };
		System.out.println();
		System.out.println("MaxValue: " + findMax(x));
		System.out.println("Sum: " + findSum(x));
		System.out.println("Search for 111: " + search(x, 111));
		System.out.println("Search for 79: " + search(x, 79));
		int[][] y = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		System.out.println("Sum of 2Dim array: " + sumOfArray(y));
		char[][] b = new char[5][19];
		fillArray2(b, '@');

		for (char[] r : b) {
			for (char c : r) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

	/*
	Output
	20! 2432902008176640000
	Sum of first 16 Positive integers: 136
	2^12: 4096
	12th Fibonacci number: 144
	Digit Sum of 12345: 15
	RACECAR reversed: RACECAR
	Sum of 5 terms of binary Series: 0.9375
	MaxValue: 133
	Sum: 387
	Search for 111: -1
	Search for 79: 6
	Sum of 2Dim array: 21
	@@@@@@@@@@@@@@@@@
	@@@@@@@@@@@@@@@@@
	@@@@@@@@@@@@@@@@@
	@@@@@@@@@@@@@@@@@
	@@@@@@@@@@@@@@@@@
	*/

}
