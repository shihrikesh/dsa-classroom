package angram;

import java.util.ArrayList;
import java.util.List;

public class FindAnagramInTwoStrings {

    public static void main(String[] args) {

        FindAnagramInTwoStrings findAnagramInTwoStrings = new FindAnagramInTwoStrings();
        findAnagramInTwoStrings.findAnagrams("cbaebabacd","abc").forEach(System.out::println);

    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        if(p.length()>=s.length()) return new ArrayList<>();
        int subArray = p.length();
        String subString="";

        for(int i=0;i<=s.length()-subArray;i++){
            subString =s.substring(i,subArray+i);
            if(isAnagram(subString,p)){
                list.add(i);
            }

            System.out.println(subString);
        }
        return list;

    }

    private boolean isAnagram(String str1, String str2){

        int[] arr = new int[26];
        for(int i=0;i<str1.length();i++){
            arr[str1.charAt(i)-'a']--;
            arr[str2.charAt(i)-'a']++;
        }

        for (int i : arr) {
            if (i != 0) {
                return false;
            }
        }
        return true;

    }
}
