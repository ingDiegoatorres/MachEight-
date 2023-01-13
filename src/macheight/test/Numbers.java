package macheight.test;

/**
 * Record class to store a pair of numbers, which -in this case- added sums the target number.
 * @author Diego Andrés Torres E.
 *
 */
public record Numbers(int a, int b) {

	public String toString() {
		return a + ", " + b; 
	}
	
}
