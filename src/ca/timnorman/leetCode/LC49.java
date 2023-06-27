package ca.timnorman.leetCode;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class LC49 {

	public static void main(String[] args) {

		Solution42 solution = new Solution42();
		String[] strs = {"eat","tea","tan","ate","nat","bat"};	// Test Data 1 from LeetCode. 
		System.out.println(solution.groupAnagrams(strs));
	}

}

class Solution42 {
    public List<List<String>> groupAnagrams(String[] strs) {
    	
    	List<List<String>> output = new ArrayList<>();
    	HashMap<String, List<String>> anagrams = new HashMap<>();
    	
    	for(String word : strs) {
    		String sortedWord = sortedWord(word);
    		if(anagrams.containsKey(sortedWord)) {
    			anagrams.get(sortedWord).add(word);
			}
    		else {
    			anagrams.put(sortedWord, new ArrayList<>());
    			anagrams.get(sortedWord).add(word);
    		}
    	}
    	anagrams.forEach((k, v) -> output.add(v));
    	return output;
    }

    /**
     * Method to take a string and arrange characters into alphabetical order. 
     * @param word The word inputed to be rearranged. 
     * @return A string of characters from the original word in alphabetical order. 
     */
	private String sortedWord(String word) {
		ArrayList<String> sortedWord = new ArrayList<>();
		
		// Break word into characters. 
		for (int i = 0; i < word.length(); i++) {
			sortedWord.add(Character.toString(word.charAt(i)));
		}
		sortedWord.sort(null);
		
		// Take sorted characters and put back into a single string. 
		String sortedString = "";
		for (String s: sortedWord) {
			sortedString += s;
		}
		return sortedString;
	}
}