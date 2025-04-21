package angram;

import java.util.HashMap;
import java.util.Map;

public class MakeAnagramFromTwoString {

    /**
     * How many character to be removed from two string to make both string anagram
     * @param args
     */

    public static void main(String[] args) {

        MakeAnagramFromTwoString object =  new MakeAnagramFromTwoString();
        System.out.println(object.makeAnagram("cde", "abc"));
        System.out.println(object.makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));

    }

    public int makeAnagram(String a, String b) {
        // Write your code here

        int count=0;
        Map<Character , Integer> map = new HashMap<>();
        for(int i=0;i<a.length();i++){
            map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0)+1);
        }
        for(int i=0;i<b.length();i++){
            map.put(b.charAt(i), map.getOrDefault(b.charAt(i), 0)-1);
        }

        for(Integer ch: map.values()){
            count +=Math.abs(ch);
        }
        return count;

    }
}
