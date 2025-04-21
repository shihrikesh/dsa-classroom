package angram;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

class AnagramFinder {

    /*
     * Complete the 'sherlockAndAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int sherlockAndAnagrams(String s) {
        int pairs = 0;

        //setup map
        HashMap<String, Integer> strings = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            String s1 = s.substring(i, i + 1);

            int c1 = strings.getOrDefault(s1, 0);
            strings.put(s1, ++c1);

            for (int j = 0; j < i; j++) {

                String s2 = s.substring(j, i + 1);
                char[] ca = s2.toCharArray();
                Arrays.sort(ca);
                s2 = new String(ca);

                int c2 = strings.getOrDefault(s2, 0);

                strings.put(s2, ++c2);
            }
        }

        //debug out
        //System.out.println(strings);

        //calc pairs
        for (int i : strings.values()) {
            pairs += (i - 1) * i / 2;
        }

        return pairs;

    }

}

public class FindAnagramInString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = AnagramFinder.sherlockAndAnagrams(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}