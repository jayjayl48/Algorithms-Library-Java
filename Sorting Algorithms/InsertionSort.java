/**
* This program demonstrates Insertion Sort on an array of 7 elements.
* The complexity of this sorting algorithm is:
* 
* Average and worst case: O(n^2)
* Best case: O(n) - The list is already sorted.
* 
* 
*
* Last modified: February 18th, 2025
*
* @author Jason Lowey
* 
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] array = new int[7];

		Scanner input = new Scanner(System.in);

		System.out.println("This program sorts an array of 7 integers");

		System.out.println("Enter integer #1: ");

		array[0] = input.nextInt();

		System.out.println("Enter integer #2: ");

		array[1] = input.nextInt();

		System.out.println("Enter integer #3: ");

		array[2] = input.nextInt();

		System.out.println("Enter integer #4: ");

		array[3] = input.nextInt();

		System.out.println("Enter integer #5: ");

		array[4] = input.nextInt();

		System.out.println("Enter integer #6: ");

		array[5] = input.nextInt();

		System.out.println("Enter integer #7: ");

		array[6] = input.nextInt();

		// Prints out input array
		System.out.println("\nThe array you inputed is: ");

		printArray(array);

		// Sort array
		InsertionSort(array);

		System.out.println("\nThe array sorted is: ");
		printArray(array);
	}

	public static void InsertionSort(int[] array) {

		for (int i = 1; i < array.length; i++) {

			int v = array[i];

			int j = i - 1;

			while (j >= 0 && array[j] > v) {

				array[j + 1] = array[j];
				j = j - 1;

			}

			array[j + 1] = v;

		}

	}

	public static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + ", ");
			
			
		}
		System.out.println();

	}

}
