/**
* This method demonstrates how to find the largest element in an Array.
* Complexity of search algorithm used in method findMax is O(n).
*
* Last modified: Febuary 12th, 2025
*
* @author Jason Lowey
* 
*/

public class Main {
    
    public static int findMax(){
        
    
    
     int array [] = {5, 29, 99, 3, 48};
      
      int max = array[0];
      for(int i = 0; i < array.length; i++){
          
      
          
          if(array [i] > max){
              max = array[i];
          }
            
      
      }
      
      return max;
      
    }
    
    public static void main(String[] args) {
        
        int max = findMax();
        
        System.out.println("The largest element in the array is " + max);
        
      
     
       
      
    }
    
}