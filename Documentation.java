
//Written by Adara Blichfeldt

public class Documentation {
	
	/**
	 * 
	 * @param args
	 */

	//Recursive 
	public static int reFib(int n) {

	 if ((n == 0) || (n == 1))
         return n;
      else
         return reFib(n - 1) + reFib(n - 2);
	}
	
	//Iterative
	//use a for loop
	public static int itFib(int n) {

		if ((n == 0) || (n == 1))
	         return n;
	
		int fib = 1;
		int prevFib = 1;
	
		for(int i = 2 ; i < n ; i++) {
			
			int temp = fib;
			fib += prevFib;
			prevFib = temp;
		}
		return fib;
	}
	
	public static void main(String[] args) {

		long startTime = System.nanoTime();
		System.out.println("Recursive method: The first 5 numbers in the Fibonacci sequence is: " + reFib(0) + ", " + reFib(1) + ", " + reFib(2) + ", " + reFib(3) + ", " + reFib(4));
		long endTime = System.nanoTime();
		long runTime = endTime-startTime;
		System.out.println("The recursive runtime efficency in nanoseconds is: " + runTime);

		long startTime2 = System.nanoTime();
		System.out.println("Iterative method: The first 5 numbers in the Fibonacci sequence is: " + itFib(0) + ", " + itFib(1) + ", " + itFib(2) + ", " + itFib(3) + ", " + itFib(4));
		long endTime2 = System.nanoTime();
		long runTime2 = endTime2-startTime2;
		System.out.println("The iterative runtime efficency in nanoseconds is: " + runTime2);
	}

}
