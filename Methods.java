package School;

import java.awt.List;
import java.util.*;

public class Methods {

	/*
	 * 1. This method will return a random integer 9, 10, 11, or 12 (9 to 12
	 * inclusive)
	 */
	public static int getRandomClass() {
		Random random = new Random();

		int rand = 0;
		rand = random.nextInt(9, 13);
		
		return rand;
	}

	/*
	 * 2. This method will return a full name separated by a space (first last) and
	 * return it in the form of last, first getFormalName("Thomas Connolly") ====>
	 * Connolly, Thomas
	 */
	public static String getFormalName(String fullName) {
		String[] name = fullName.split(" ");

//        for (int i = 0; i < name.length; i++) {
//            System.out.println();
//        }
		
		return name[1] + ", " + name[0];
			
			
	}

	/*
	 * 3. This will return a new word that is the reverse. reverse("KNIGHTS") ====>
	 * STHGINK
	 */
	public static String reverse(String name) {
		String[] reverseLetter = new String[name.length()];
		String reverse = "";

		for (int i = 0; i < name.length(); i++) {
			reverseLetter[i] = name.substring(name.length()-(i+1), name.length()-i);
		}
		
		for(int i = 0; i< reverseLetter.length; i++) {
			reverse += (reverseLetter[i]);
		}

		return reverse;

	}

	/*
	 * 4. Test integer n for prime or not prime precondition n>=2
	 */
	public static boolean isPrime(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i != 0) {
				return true;
			} else if(n % i == 0 && i != 1 && i != n) {
				return false;
			}
		}

		return false;

	}

	/* 5. Calculates the sum of the digits of int n */
	public static int sumDigits(int n) {
		int divideTen = 1;
		int sum = 0;

		if (n == 0) {
			return sum;
		}

		divideTen = divideTen * 10;
		sum = n % divideTen + sumDigits(n/divideTen);

		return sum;

	}

	/* 6.This method prints a rowXcol matrix of asterisks */
	public static void matrix(int row, int col) {
		String[][] matrix = new String[row][col];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = "*";
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

	/* 7.Find and return the maximum value in the int array numbers */
	public static int getMax(int[] numbers) {
		int max = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}

		return max;

	}

	/*
	 * 8. Determine if every element in the int array numbers is positive. Return
	 * True/False
	 */
	public static boolean allPositive(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] <= 0) {
				return false;
			}
		}
		return true;

	}

	/*
	 * 9. An int array []salary contains the integer salary of all employees. Write
	 * a method that calculates the average salary.
	 */

	public static double avgSal(int[] salary) {
		int sum = 0;
		int count = 0;
		for (int i = 0; i < salary.length; i++) {
			sum += salary[i];
			count++;
		}

		return (double) sum / count;

	}

	/**
	 * 10. This method will determine if an array of Strings (words[]) is in
	 * alphabetical order. Return true/false. isAlphabetical(words) {apple,banana,
	 * strawberry} ====> true {lime, cherry, lemon} ====> false
	 */

	public static boolean isAlphabetical(String[] words) {
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {

				if (words[i].compareTo(words[j]) > 0) {
					return false;
				}
			}
		}

		return true;

	}

	/* 11. returns the average of the integers in ArrayList data */
	public static double getAverage(ArrayList<Integer> data) {
		Iterator<Integer> iterator = data.iterator();

		int sum = 0;

		while (iterator.hasNext()) {
			sum += iterator.next();
		}

		return (double) sum / data.size();
	}

	/**
	 * 12. An ArrayList words contains strings that are ordered alphabetically. Add
	 * the String ins to the list in the correct position
	 */
	public static void insertion(ArrayList<String> words, String ins) {
	    for (int j = 0; j < words.size(); j++) {
	        if (ins.compareTo(words.get(j)) <= 0) {
	            words.add(j, ins); 
	            return; 
	        }
	    }
	    // If we reach here, ins is greater than all elements, so add to the end
	    words.add(ins);
	}


	// 13. Return minimum value of an ArrayList of Integers
	public static int getMin(ArrayList<Integer> numbers) {
	    Iterator<Integer> iterator = numbers.iterator();
	    int min = numbers.get(0); 

	    while (iterator.hasNext()) {
	        int current = iterator.next(); 
	        if (current < min) {           
	            min = current;             
	        }
	    }
	    
	    return min;
	}


	// 14. Return a new ArrayList that contains only the positive numbers from
	// numbers.
	public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers) {
	    ArrayList<Integer> positives = new ArrayList<>();
	    Iterator<Integer> iterator = numbers.iterator();

	    while (iterator.hasNext()) {
	        int current = iterator.next();
	        if (current >= 0) {   
	            positives.add(current);
	        }
	    }
	    
	    return positives;
	}


	// 15. This method will return one Array of Strings that contain all of the
	// Strings from ArrayList one followed by all of the Strings from ArrayList two
	// The Lists might be different sizes

	public static String[] append(ArrayList<String> one, ArrayList<String> two) {
	    String[] combineList = new String[one.size() + two.size()];
	    
	    Iterator<String> iteratorOne = one.iterator();
	    Iterator<String> iteratorTwo = two.iterator();
	    
	    int index = 0;

	    while (iteratorOne.hasNext()) {
	        combineList[index] = iteratorOne.next();
	        index++;
	    }
	    
	    while (iteratorTwo.hasNext()) {
	        combineList[index] = iteratorTwo.next();
	        index++; 
	    }
	    
	    return combineList;
	}


	// 16. Calculate and return the the average of a 2Dim Array
	public static double average(int[][] numbers) {
	    double sum = 0;
	    int count = 0;  
	    
	    for (int i = 0; i < numbers.length; i++) {
	        for (int j = 0; j < numbers[i].length; j++) {
	            sum += numbers[i][j];
	            count++;  
	        }
	    }
	    
	    return sum / count; 
	}


	// 17. Find and return the the minimum value of a 2Dim Array
	public static int minimum(int[][] numbers) {
		
		int min = numbers[0][0];
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if(min > numbers [i][j]) {
					min = numbers[i][j];
				}
			}
		}
		
		return min;

	}

	// 18. Create an 2Dim array with random numbers 0-100 (include 0 and 100)
	// the dimensions of the array will be rows x cols
	public static int[][] getRandomArray(int rows, int cols) {
		int[][] arr = new int[rows][cols];
		
		Random random = new Random();

		int rand = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				rand = random.nextInt(0, 101);
				arr[i][j] = rand;
			}
		}
		
		return arr;
		
		

	}

	// 19. returns a one dimensional array of strings from words that are
	// more than 5 letters
	public static String[] vocab(String[][] words) {
	    ArrayList<String> tempList = new ArrayList<>();
	    
	    for (int i = 0; i < words.length; i++) {
	        for (int j = 0; j < words[i].length; j++) {
	            if (words[i][j].length() > 5) {
	                tempList.add(words[i][j]);
	            }
	        }
	    }
	    
	    return tempList.toArray(new String[0]);  
	}


	public static void main(String[] args) {
		 
        System.out.println("Test 1: getRandomClass");
        System.out.println(getRandomClass());
        
       
        System.out.println("Test 2: getFormalName");
        System.out.println(getFormalName("Thomas Connolly")); 
        

        System.out.println("Test 3: reverse");
        System.out.println(reverse("KNIGHTS"));
        
      
        System.out.println("Test 4: isPrime");
        System.out.println(isPrime(13)); 
        System.out.println(isPrime(20)); 
        
       
        System.out.println("Test 5: sumDigits");
        System.out.println(sumDigits(12345)); 
        
      
        System.out.println("Test 6: matrix");
        matrix(3, 4); 
        
       
        System.out.println("Test 7: getMax");
        int[] numbers = {5, 10, 15, 3, 8};
        System.out.println(getMax(numbers)); 
        
      
        System.out.println("Test 8: allPositive");
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(allPositive(nums)); 
        
       
        System.out.println("Test 9: avgSal");
        int[] salary = {50000, 60000, 55000, 70000};
        System.out.println(avgSal(salary)); 
        
       
        System.out.println("Test 10: isAlphabetical");
        String[] words1 = {"apple", "banana", "strawberry"};
        String[] words2 = {"lime", "cherry", "lemon"};
        System.out.println(isAlphabetical(words1));
        System.out.println(isAlphabetical(words2));
        
        
        System.out.println("Test 11: getAverage");
        ArrayList<Integer> data = new ArrayList<>();
        data.add(10); 
        data.add(20); 
        data.add(30);
        System.out.println(getAverage(data)); 
        
      
        System.out.println("Test 12: insertion");
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("apple"); 
        wordList.add("banana"); 
        wordList.add("strawberry");
        insertion(wordList, "cherry");
        System.out.println(wordList);
        
      
        System.out.println("Test 13: getMin");
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(5); 
        numList.add(10); 
        numList.add(2);
        System.out.println(getMin(numList)); 
        
        
        System.out.println("Test 14: removeNegatives");
        ArrayList<Integer> numListWithNeg = new ArrayList<>();
        numListWithNeg.add(5); 
        numListWithNeg.add(-10); 
        numListWithNeg.add(15);
        System.out.println(removeNegatives(numListWithNeg)); 
        
       
        System.out.println("Test 15: append");
        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("apple"); listOne.add("banana");
        
        ArrayList<String> listTwo = new ArrayList<>();
        listTwo.add("strawberry"); listTwo.add("cherry");
        
        String[] combined = append(listOne, listTwo);
        for (String s : combined) {
            System.out.println(s);
        } 
        
        
        System.out.println("Test 16: average");
        int[][] numbers2D = {{10, 20, 30}, {40, 50, 60}};
        System.out.println(average(numbers2D));
        
       
        System.out.println("Test 17: minimum");
        System.out.println(minimum(numbers2D)); 
        
       
        System.out.println("Test 18: getRandomArray");
        int[][] randomArray = getRandomArray(2, 3);
        for (int[] row : randomArray) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        } 
        
       
        System.out.println("Test 19: vocab");
        String[][] words2D = {{"apple", "strawberry"}, {"banana", "grapefruit"}};
        String[] vocabWords = vocab(words2D);
        for (String word : vocabWords) {
            if (word != null) {
                System.out.println(word);
            }
		
        }

	}
}


//Name: Namish
//Project Name: Review Methods
//Date: 9-9-24
//Project Description: A review for the start of the course