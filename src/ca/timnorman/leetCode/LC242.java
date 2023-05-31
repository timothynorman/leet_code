/* https://leetcode.com/problems/valid-anagram/
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise. 
 * NeetCode: Arrays and Hashing 2/9
 */

package ca.timnorman.leetCode;

import java.util.ArrayList;

public class LC242 {

	public static void main(String[] args) {

		Solution solution = new Solution();
		String[] testData = {"anagram", "nagaram", "rat", "car", "bookcase", "bookcaes"};
		
		for(int i = 0; i < testData.length-1; i+=2) {
			System.out.println(solution.isAnagram(testData[i], testData[i+1]));
		}
	}
}

class Solution {
	public boolean isAnagram(String s, String t) {
		ArrayList<String> first = stringToArrayList(s);
		ArrayList<String> second = stringToArrayList(t);
		
		first.sort(null);
		second.sort(null);
		if(first.equals(second)) {
			return true;
		}
		return false;		
	}
	
	private ArrayList<String> stringToArrayList(String input){
		ArrayList<String> output = new ArrayList<>();
		for(int i = 0; i < input.length(); i++) {
			output.add(Character.toString(input.charAt(i)));
		}
		return output;
	}
}