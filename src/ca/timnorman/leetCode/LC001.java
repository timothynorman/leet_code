/*
 * https://leetcode.com/problems/two-sum/
 * Given an array of integers nums and an integer target, return 
 * indices of the two numbers such that they add up to target.
 * NeetCode: Arrays and Hashing 3/9 
 */

package ca.timnorman.leetCode;

import java.util.HashMap;

public class LC001 {

	public static void main(String[] args) {
		Solution1 solution = new Solution1();
		int[] nums1 = {2, 7, 11, 15};
		int[] nums2 = {3, 2, 4};
		int target1 = 9;
		
		int[] locations1 = (solution.twoSum(nums1, target1));
		int[] locations2 = (solution.twoSum(nums1, 17));
		int[] locations3 = (solution.twoSum(nums1, 26));
		int[] locations4 = (solution.twoSum(nums2, 6));

		System.out.printf("%d %d %n", locations1[0], locations1[1]);
		System.out.printf("%d %d %n", locations2[0], locations2[1]);
		System.out.printf("%d %d %n", locations3[0], locations3[1]);
		System.out.printf("%d %d %n", locations4[0], locations4[1]);
		
	}
	

}

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        int[] locations= new int[2];
        
        for(int i = 0; i < nums.length; i++) {
        	int diff = target - nums[i];
        	numbers.put(diff, i);
        }
        
        // Issue is when a number is half the target and finds itself. 
        for(int i = 0; i < nums.length; i++) {
        	if(numbers.containsKey(nums[i]) && numbers.get(nums[i]) != i) {
        		locations[0] = numbers.get(nums[i]);
        		locations[1] = i;
        		return locations;
        	}
        }
        return null;
    }
}
