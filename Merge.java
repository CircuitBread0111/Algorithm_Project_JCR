///////////////////////////|
//|File: Merge.java
//|Author: Jerrin C. Redmon
//|Language: Java
//|Version: 1.0
//|Date: 
///////////////////////////|

//----------------------------------------------------------------

/* ALGORITHM
 * DESCRIPTION: Implements a merge sorting algorithm
 * INPUT: Unsorted array of length n integers
 * OUTPUT: Sorted array of length n integers
 * TIME: O(n log n)
 * SPACE: O(n)
 */ 

public class Merge {

	int o = 0;
	
	void sort(int array[], int left, int right) {
	
		// Check left and right sizes //
		if (left < right) {
			o+=1;
			// Sets middle of array //
			int middle = left + (right - left) / 2;
			
			// Sorts first half //
			sort(array, left, middle);
			sort(array, middle + 1, right);
			// Merge method //
			merge(array, left, middle, right);
		}
		o += 1;
	}
	
	
	
	// Merges Arrays //
	void merge(int array[], int left, int middle, int right) {
	
		int nLeft = middle - left + 1; 		// length for left side of array
		int nRight = right - middle;  		// length for right side of array
		int arrayLeft[] = new int[nLeft]; 	// Left sub-array
		int arrayRight[] = new int[nRight]; // Right sub-array
		
		// Fill sub-arrays //
		for (int i = 0; i < nLeft; i++) {
			arrayLeft[i] = array[left + i];
		}
		for (int j = 0; j < nRight; j++) {
			arrayRight[j] = array[middle + 1 + j];
		}
		
		int i = 0; 		// Initialize sub-arrays
		int j = 0; 		// Initialize sub-arrays
		int k = left; 	// Initial index of merged sub-array
		
		while (i < nLeft && j < nRight) {
			if (arrayLeft[i] <= arrayRight[j]) {
				array[k] = arrayLeft[i];
				i++;
			}
			else {
				array[k] = arrayRight[j];
				j++;
			}
			k++;
			//o += 1;
			
		}
		
		// Fills elements of Left sub-array //
		while (i < nLeft) {
			array[k] = arrayLeft[i];
			i++;
			k++;
		}
	
		// Fills elements of Right sub-array //
		while (i < nRight) {
			array[k] = arrayRight[i];
			j++;
			k++;
		}
		
		
    }
    
    public int operations() {
			return o;
	}
	
}
