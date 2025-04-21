package algorithms;

import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
    // Write your code here
    
    if(magazine.size()< note.size()){
        System.out.println("No");
    } else {
        Map<String , Long> map1= new HashMap<>();
        Map<String , Long> map2= new HashMap<>();
        map1 = magazine.stream()
        .collect(Collectors.
        groupingBy(Function.identity(), Collectors.counting()));
        map2 = note.stream()
        .collect(Collectors.
        groupingBy(Function.identity(), Collectors.counting()));
        
        int count=0;
        
        for(String str: map2.keySet()){
            if(map1.containsKey(str) && map1.get(str)>= map2.get(str)){
                count++;
            }
        }
        if(count==map2.size()){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }

    }

}

public class RansomNote {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        List<String> magazine = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        List<String> note = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        Result.checkMagazine(magazine, note);

        bufferedReader.close();
    }
}
