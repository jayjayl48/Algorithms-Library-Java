package euclidGCD;

import java.util.Scanner;



/**
* This program demonstrates Euclid's Algorithm for computing gcd (m,n) 
*
* Last modified: Febuary 8th, 2025
*
* @author Jason Lowey
* 
*/
public class Main {

	public static void main(String[] args) {
		
		boolean run = true;

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to Euclids Algorithm Program!\n");

	

			System.out.println("Enter i for iterative version");

			System.out.println("Enter r for recursive version");

			String choice = input.nextLine();

			if (choice.startsWith("i")) {

				System.out.println("Enter first integer: ");

				int m = input.nextInt();

				System.out.println("\nEnter second integer: ");

				int n = input.nextInt();

				System.out.println("\nThe gcd of " + m + " and " + n + " is " + iterative(m, n));

			}

			else if (choice.startsWith("r")) {

				System.out.println("Enter first integer: ");

				int m = input.nextInt();

				System.out.println("Enter second integer: \n");

				int n = input.nextInt();

				System.out.println("\nThe gcd of " + m + " and " + n + " is " + recursive(m, n));
				

			}
			System.out.println("\nThank you for using this program!");

		}
	

	

	// The iterative version method
	public static int iterative(int m, int n) {

		int r = 0;

		while (n != 0) {

			r = m % n;
			m = n;
			n = r;
		}

		return m;

	}

	// The recursive version method
	public static int recursive(int a, int b) {

		if (a == 0) {
			return b;
		}

		return recursive(b % a, a);

	}

}
