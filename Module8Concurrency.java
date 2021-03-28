//Written by Adara Blichfeldt

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
//thread.currentthread().getid()
// synchronized and join thread for multithreads.

public class Module8Concurrency {

	private static int sum = 0;
	private static int sum2 = 0;
	public static synchronized void sum2(int random) {
		sum2 += random;
	}
	
	public static int getRandomInteger(int maximum, int minimum){
        return ((int) (Math.random()*(maximum - minimum))) + minimum;
    }
	
	public static void main(String[] args) throws InterruptedException {
		Random rn = new Random();

		Thread t1 = new Thread (new Runnable() {
			
			public void run() {
				for(int i = 0; i < 2000000; i++) {
					int random = getRandomInteger(10, 1);
					sum += random;
					System.out.println(sum);
				}
			}
		});
		
		long startTime = System.nanoTime();
		t1.start();
		t1.join();
		//System.out.println("status = " + t1.isAlive());
		long endTime = System.nanoTime();
		long runTime = endTime-startTime;
		
		
		
		Thread t2 = new Thread (new Runnable() {
			
			public void run() {
				for(int i = 0; i < 1000000; i++) {
					int random = getRandomInteger(10, 1);
					sum2(random);
					System.out.println(sum2);
				}
			}
		});
		
		Thread t3 = new Thread (new Runnable() {
			
			public void run() {
				for(int i = 0; i < 1000000; i++) {
					int random = getRandomInteger(10, 1);
					sum2(random);
					System.out.println(sum2);
				}
			}
		});
		long startTime2 = System.nanoTime();
		t2.start();
		t3.start();
		try {
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long endTime2 = System.nanoTime();
		long runTime2 = endTime2-startTime2;
		
		System.out.println("The time it took to run the solo thread is: " + runTime + " nanoseconds");
		System.out.println("The time it took to run the two threads at once is: " + runTime2 + " nanoseconds");
	}

}
