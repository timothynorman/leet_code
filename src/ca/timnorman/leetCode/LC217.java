/*
 * Given an integer array nums, return true if any value appears at least twice in the array, 
 * and return false if every element is distinct.
 */
package ca.timnorman.leetCode;

import java.util.HashMap;

public class LC217 {

	public static void main(String[] args) {
		int[] test1 = {1,2,3,1};
		System.out.println(containsDuplicate(test1));
	}
	
	
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> duplicates = new HashMap<>();
        for(int i : nums){
            if(duplicates.get(i) == null){
                duplicates.put(i, i);
            }
            else {
                return true;
            }
        } 
    return false;
    }
	

}
