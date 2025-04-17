/**
* This program asks the user to input a string and checks to see if 
* the string is a palindrome
*
* Last modified: April 17th, 2025
*
* @author Jason Lowey
* 
*/


import java.util.Scanner;

class Palindrome {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a lowercase string: ");

    String s = input.nextLine();

     System.out.println();

    isPalindrome(s);

  }

  public static void isPalindrome(String s1) {
    s1 = s1.toLowerCase();

    String s2 = "";
    for (int i = s1.length() - 1; i >= 0; i--) {
      s2 = s2 + s1.charAt(i);
    }

    if (s2.equals(s1)) {
      System.out.println(s1 + " is a palindrome");

    }

    else {
      System.out.println(s1 + " is not a palindrome");
    }
  }
}
