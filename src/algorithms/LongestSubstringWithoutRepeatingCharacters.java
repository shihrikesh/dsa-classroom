package algorithms;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "abcbbcbbkhlkkmnhhgbabfds";
        int longestSubstringLength = findLongestSubstringWithoutRepeatingCharacters(str);
        System.out.println(longestSubstringLength);
    }

    private static int findLongestSubstringWithoutRepeatingCharacters(String str) {
        // map to store the characters in the string and their last occurrence index
        Map<Character, Integer> charMap = new HashMap<>();
        int pointer=0;
        int maxLength=0;
        for(int i=0;i<str.length();i++){
            char currentChar = str.charAt(i);
            if(charMap.containsKey(currentChar)){
                pointer= Math.max(pointer, charMap.get(currentChar)+1);
            }
            maxLength = Math.max(maxLength, i-pointer+1);
        }
        return maxLength;
    }
}