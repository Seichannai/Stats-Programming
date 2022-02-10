/** This class provides methods for generating 
 * random permutations of integers.
 * It provides a counter of the number of
 * steps performed by each method when generating
 * a permutation.
 */

import java.util.Random;

public class Permutations {

	private Random rand;  // Random number generator
	private int stepCounter;
	
	
	/** Makes a random permutation generator
	 */
	public Permutations() {
		this.rand = new Random();
	}

	/** Generates a random permutation of
	 * the values in 1..a.length
	 * @param a The array to hold the permutation
	 */
	public  void algorithm1(int[] a) {
		stepCounter = 0;
		int n = a.length;
		int next;
		for (int i = 0; i < n; i++) {
			// generate numbers until you get one
			// that is not already used
			do {
				next = rand.nextInt(n);
			} while (alreadyUsed(a, i, next));
			// store the next number
			a[i] = next;
			System.out.println ("This is algrorith1 :  " + next);
		}
	}
	
	/** Searches a[0..size-1] for val
	 * @param a The array to search for a match
	 * @param size The number of positions to search
	 * @param val The target of the search
	 * @return true if val was found
	 */
	private  boolean alreadyUsed(int[] a, int size, int val) {
		for (int i = 0; i < size; i++) {
			if (a[i] == val) {
				return true;
			}
		}
		return false;
	}
	
	public  void algorithm2(int[] a) {
		stepCounter = 0;
		int n = a.length;
		// set up an array to keep track of
		// values already used
		boolean[] used = new boolean[n+1];
		for (int i = 0; i < used.length; i++) {
			used[i] = false;
			
		}
		
		int next;
		for (int i = 0; i < n; i++) {
			do {
				// generate numbers until you get one
				// that is not already used
				next = rand.nextInt(n) + 1;
			} while (used[next]);
			// store next value and record it
			a[i] = next;
			used[next] = true;
			System.out.println ("This is algrorith2 :  " + next);
			
		}
		
	}
	
	public void algorithm3(int[] a) {
		stepCounter = 0;
		int n = a.length;
		// store all the numbers in order
		for (int i = 0; i < n; i++) {
			a[i] = i+1;
		}
		// randomly shuffle the numbers
		for (int i = 0; i < n; i++) {
			int temp = a[i];
			int j = rand.nextInt(n);
			a[i] = a[j];
			a[j] = temp;
			
		System.out.println ("This is algrorith3 :  " + temp);
		}
	}

	/**
	 * @return the stepCounter
	 */
	public int getStepCounter() {
		return stepCounter;
	}
}