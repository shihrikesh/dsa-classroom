package angram;

import java.util.HashMap;
import java.util.Map;

public class Anagram3 {

    // make anagram from two string by removing character
    //hacker rank

    public static void main(String[] args) {

        Anagram3 anagram3 = new Anagram3();
        System.out.println(anagram3.makeAnagram("abc","dce"));

    }

    public int makeAnagram(String a, String b) {
        // Write your code here

        int count=0;
        Map<Character , Integer> map = new HashMap<>();
        for(int i=0;i<a.length();i++){
            // increment all in first
            map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0)+1);
        }
        for(int i=0;i<b.length();i++){
            // decrement all in
            map.put(b.charAt(i), map.getOrDefault(b.charAt(i), 0)-1);
        }

        for(Integer ch: map.values()){
            // Math.abs return value in non negative
            count +=Math.abs(ch);
        }
        return count;

    }
}
