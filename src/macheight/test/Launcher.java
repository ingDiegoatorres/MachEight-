package macheight.test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;


/**
 * Launcher class with the main method.
 * 
 * First argument: comma separated numbers (without spaces)
 * Secoond argument: target number
 * @author Diego Torres
 *
 */
public class Launcher {
	public static void main (String...args) {
		//Add numbers to a set (no repetead numbers)
		Set<Integer> numbers = new TreeSet<>();
		Integer target = null;
		try {
			if (args!=null) {
				System.out.println("Launcher " + args[0] + " " + args[1]);
				String [] nums = args[0].split(",");
				for (String n: nums) {
					numbers.add(Integer.parseInt(n));
				}
				//parse stringss to integer
				target = Integer.parseInt(args[1]);
			}
		}catch(RuntimeException e) {
			System.out.println("Error getting data");
			e.printStackTrace();
		}
		
		
		//Execute solutiion algorithm O(2n)
		List<Numbers> res = new Solution().findSum(numbers, target);
		
		//print result
		res.forEach(System.out::println);
		
					
	}
}
