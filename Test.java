///////////////////////////|
//|File: Test.java
//|Author: Jerrin C. Redmon
//|Language: Java
//|Version: 1.0
//|Date: 
///////////////////////////|

//----------------------------------------------------------------

/*
 * DESCRIPTION: 
 * Tests Complexity of Sorting Algorithms
 */ 

public class Test {

////////////////////////////////////////////////////
	private static void print(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d,", array[i]);
		}
		System.out.println();
	}
////////////////////////////////////////////////////
	


	public static void main(String args[]) {
		
		int n = 64;
		int loop = 100;
		//
		double GenAvgTime = 0;
		int GenAvgOps = 0;
		//
		double BsAvgTime = 0;
		int BsAvgOps = 0;
		//
		double MsAvgTime = 0;
		int MsAvgOps = 0;
		
		
		
		//Loop
		for (int i = 0; i <= loop; i++) {
		
			/////////////////////////////////////
			//Generator
			Generator gen = new Generator();
			long startTime = System.nanoTime();
			int[] array = gen.generate(n);
			long endTime = System.nanoTime();
			double totalTime = (endTime - startTime) / 1000000.0;
			//GenAvg
			GenAvgOps += gen.operations();
			GenAvgTime += totalTime;
			/////////////////////////////////////
			//Bubble
			Bubble bs = new Bubble();
			long startTimeBubble = System.nanoTime();
			bs.sort(array);
			long endTimeBubble = System.nanoTime();
			double totalTimeBubble = (endTimeBubble - startTimeBubble) / 1000000.0;
			//BsAvg
			BsAvgOps += bs.operations();
			BsAvgTime += totalTimeBubble;
			/////////////////////////////////////
			//Merge
			Merge ms = new Merge();
			long startTimeMerge = System.nanoTime();
			ms.sort(array, 0, array.length - 1);
			long endTimeMerge = System.nanoTime();
			double totalTimeMerge = (endTimeMerge - startTimeMerge) / 1000000.0;
			//MsAvg
			MsAvgOps += ms.operations();
			MsAvgTime += totalTimeMerge;
			
		}
		
		
		
		
		
		
		// Unsorted List //
		System.out.println("\nNUMBER GENERATOR");
		System.out.println("n:" + n);
		GenAvgOps = GenAvgOps / loop;
		System.out.println("OPERATIONS: " + GenAvgOps);
		GenAvgTime = GenAvgTime / loop;
		System.out.println("TIME: " + GenAvgTime + "ms");
		//Bubble
		System.out.println("\nBUBBLE SORT");
		System.out.println("n:" + n);
		BsAvgOps = BsAvgOps / loop;
		System.out.println("OPERATIONS: " + BsAvgOps);
		BsAvgTime = BsAvgTime / loop;
		System.out.println("TIME: " + BsAvgTime + "ms");
		//Merge
		System.out.println("\nMERGE SORT");
		System.out.println("n:" + n);
		MsAvgOps = MsAvgOps / loop;
		System.out.println("OPERATIONS: " + MsAvgOps);
		MsAvgTime = MsAvgTime / loop;
		System.out.println("TIME: " + MsAvgTime + "ms");
	
	}
}

