package macheight.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Class wich perfomrs calculations to get the resulting numbers
 * @author diego
 *
 */
public class Solution {
	
	private void validateInput(Set<Integer> numbers, Integer target){
		if (target == null)
			throw new RuntimeException("No target number defined");
		if (numbers == null || numbers.isEmpty())
			throw new RuntimeException("Numbers list is empty");	
	}
	
	public List<Numbers> findSum(Set<Integer> numbers, Integer target){
		validateInput(numbers, target);
		List<Numbers> res = new ArrayList<>();
	    final Map<Integer, Integer> map = numbers.stream()
	    	      .collect(Collectors.toMap(Function.identity(), Function.identity()));
	
	    numbers.forEach(e -> {Integer b = map.remove(target - e);	    
			    					 if (b!=null && !b.equals(e)) {
			    						 map.remove(e);
			    						 res.add(new Numbers(e, b));
			    					 }
	    					});	
		return res;
	}
}
