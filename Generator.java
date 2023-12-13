///////////////////////////|
//|File: Generator.java
//|Author: Jerrin C. Redmon
//|Language: Java
//|Version: 1.0
//|Date: November 6, 2023
///////////////////////////|

//----------------------------------------------------------------

/* ALGORITHM
 * DESCRIPTION: Generates a list of unique numbers
 * INPUT: n length of list; r range of numbers
 * OUTPUT: array of length n of unique numbers
 * TIME: ???
 * SPACE: O(n)
 */ 

// Imports //
import java.util.Random;

public class Generator {
	
		int o = 0;
		
	public int[] generate(int n) {
		
		int length = n; 				// length of list
		Random rnd = new Random();		// Random Function
		int[] array = new int[length];	// Array List
		int rNum = rnd.nextInt(n);		// Random Number
		
		
		// Outer Loop //
		for (int i = 0; i < array.length; i++) {
			array[i] = -1;
			o += 1;
		}
		
		// Inner Loop //
		for (int i = 0; i < array.length; i++) {
			if (array[i] == -1) {
				array[i] = rNum;
				rNum = rnd.nextInt(n);
				o += 1;
				if (i < array.length - 1) {
					i = -1;
					o += 1;
				}
			}
			// Duplicate Found //
			else if (array[i] == rNum) {
				rNum = rnd.nextInt(n);
				o += 1;
				i = -1;
			}
		}
		return array;
	}
	
	public int operations() {
			return o;
	}
}
	
