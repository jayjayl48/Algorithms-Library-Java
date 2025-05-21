/* This program demonstrates the Sieve Of Eratosthenes algorithm for finding all prime numbers from 1 to any given n.
*
* Last modified: May 21st, 2025
*
* @author Jason Lowey
* 
*/
public class SieveOfEratosthenesTest {
    public static void main(String[] args) {


        sieveOfEratosthenes(10);
        sieveOfEratosthenes(25);
      
    }

    public static void sieveOfEratosthenes(int n) {

        int initArray[]=new int [n];

        //Generate int array of length n and fill.
        for(int i=0; i <n; i++) {
            initArray[i]=i+1;

        }


        //Check if number is prime. If prime then print

        for(int i=0; i < n; i ++) {

            if(primeChecker(initArray[i])) {
                System.out.print(initArray[i] + " ");
            }



        }


    }


    //Finds prime numbers

    public static boolean primeChecker(int n) {

        if(n < 2) {
            return false;
        }


        for(int i=2; i * i <=n; i ++) {
            if(n % i==0) {
                return false;
            }
        }


        return true;



    }
}
