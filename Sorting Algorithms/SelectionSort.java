/**
* This program demonstrates the Selection Sort algorithm on an array of 7 elements.
* 
* The complexity of this sorting algorithm is O(n^2).
* 
* Last modified: February 26th, 2025
*
* @author Jason Lowey
* 
*/
public class Main {

	public static void main(String[] args) {
	    
	   
	    int [] array = {25, 14, 69, 55, 203, 1, 33};
	    
	    System.out.println("Original Array: ");
	    
	    for(int i = 0; i < array.length; i++){
	        
	        
	        System.out.print(array[i] + ", ");
	        
	        
	    }
	    
	    
	    SelectionSort(array);
	    
	    System.out.println();
	    
	    System.out.println("\nNew Array: ");
	    
	    for(int i =0; i < array.length; i ++ ){
	          System.out.print(array[i] + ", ");
	        
	    }
	    
	}

	public static void SelectionSort(int[] array) {
	    
	    for(int i = 0; i < array.length-1; i++){
	        
	        int min = i;
	        
	        //Find minimum element in array
	        for(int j = i + 1; j < array.length; j++){
	            
	            if(array[j] < array[min]){
	                min = j;
	            }
	            
	        }
	        
	        //Swaps the found min element with first element
	        int t = array[min];
	        array[min] = array[i];
	        array[i] = t;
	        

	    }
	    
	}

}
