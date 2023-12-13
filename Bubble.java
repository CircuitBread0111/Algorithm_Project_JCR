///////////////////////////|
//|File: Bubble.java
//|Author: Jerrin C. Redmon
//|Language: Java
//|Version: 1.0
//|Date: November 6, 2023
///////////////////////////|

//----------------------------------------------------------------

/* ALGORITHM
 * DESCRIPTION: Implements a bubble sort algorithm
 * INPUT: Unsorted array of length n integers
 * OUTPUT: Sorted array of length n integers
 * TIME: O(n^2)
 * SPACE: O(n)
 */ 

public class Bubble {

	int o = 0;
	
	public void sort(int array[]) {
		
		int n = array.length;	// length of array
		int i;					// loop i
		int j;					// loop j
		int temp;				// temporary storage variable
		boolean swap;			// checks if a swap occurred
		
		// Outer Loop //
		for (i = 0; i < n-1; i++) {
			swap = false;
			// Inner Loop //
			for (j = 0; j < (n-i)-1; j++) {
				o++;
				if (array[j] > array[j+1]) {
					o += 1;
					// Swap variables //
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					swap = true;
					o += 1;
					
				}
				
			}
			// Break Loop //
			if (!swap) {
				break;
			}
			
		}
	}
	
	public int operations() {
			return o;
	}
}


