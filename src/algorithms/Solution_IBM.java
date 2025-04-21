package algorithms;

import java.util.HashMap;

public class Solution_IBM {
    public int maxLength(int[] a, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];

            if (sum == k) {
                maxLength = i + 1;
            }

            if (map.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - map.get(sum - k));
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution_IBM sol = new Solution_IBM();
        int[] a = {1, -1, 5, -2, 3};
        int k = 3;
        System.out.println(sol.maxLength(a, k));  // Output: 4
    }
}