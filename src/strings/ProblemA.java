package strings;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProblemA {

    /**
     * return first letter which is duplicate
     * @param args
     */
    public static void main(String[] args) {

        var string= "abttcddd";

        System.out.println(returnDuplicateChar(string));

    }

    static String returnDuplicateChar(String string){
        List<Character> list = new ArrayList<>();
        String dup="";
        for(int i=0;i<string.length();i++){
            if(list.contains(string.charAt(i))){
                dup= String.valueOf(string.charAt(i));
                return dup;
            } else {
                list.add(string.charAt(i));
            }
        }
        return dup;
    }
}
