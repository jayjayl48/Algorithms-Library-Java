/**
* This program demonstrates Linear Seach on an array of 8 elements
* 
* Last modified: April 3rd, 2025
*
* @author Jason Lowey
* 
*/

class LinearSearchTest {
    public static void main(String[] args) {
        
         int [] array = {48,19,13,72,9,51,47,3};
         
         int index = linearSearch(array,72);
         
         if(index == -1){
             
             System.out.println("Target not found");
         }
         
         else{
             System.out.println("target found at index: " + index);
         }
      
    }
    public static int linearSearch(int [] array, int target){
        
        boolean found;
        
        for(int i = 0; i < array.length; i++){
            
            if(target == array[i]){
               return i;
                
            }    
        }
        
        return -1;
    }
}
