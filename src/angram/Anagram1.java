package angram;

import java.util.ArrayList;
import java.util.List;

public class Anagram1 {

    public static void main(String[] args) {
        Anagram1 anagram1 = new Anagram1();
        System.out.println(anagram1.findAnagrams("abba","ab"));
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        int[] arr = new int[26];
        if (p.length() > s.length()) return new ArrayList<>();
        int subArray = p.length();
        String subString = "";
        for (int i = 0; i < subArray; i++) {
            subString += s.charAt(i);
        }
        return null;


    }
}