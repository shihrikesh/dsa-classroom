package angram;

public class ValidateAnagramInTwoString {

    // find give to string are anagram of each other or not

    // apple, elapp true

    // sap. aps true
    // tab  bbt false

    public static void main(String[] args) {

        System.out.println(validateAnagram("apple","papel"));

        System.out.println(validateAnagram("apple","mango"));

        System.out.println(validateAnagram("a","mango"));

    }


    public static boolean validateAnagram(String str1, String str2) {

        int[] count1 = new int[26];

        if(str1.length()!=str2.length()) return false;
        for(int i=0;i<str1.length();i++) {
            count1[str1.charAt(i) - 'a']++;
            count1[str2.charAt(i) - 'a']--;
        }

        for(int count: count1){
            if(count!=0){
                return false;
            }
        }
        return true;

    }
}
