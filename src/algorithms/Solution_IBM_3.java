package algorithms;

import java.util.List;

public class Solution_IBM_3 {
    public int atMostSum(List<Integer> arr, int k) {
        int res = 0;

        // Iterate through the list starting at each element
        for (int i = 0; i < arr.size(); i++) {

            // Find current sum (between i and j)
            int curr = 0;
            for (int j = i; j < arr.size(); j++) {
                curr += arr.get(j);

                // If current sum is within the limit, update result
                if (curr <= k) {
                    res = Math.max(res, j - i + 1);
                } 
                // If sum exceeds k, stop further addition for this subarray
                else {
                    break;
                }
            }
        }

        // Return the maximum length of subarray found
        return res;
    }

    public static void main(String[] args) {
        Solution_IBM_3 sol = new Solution_IBM_3();
        List<Integer> arr = List.of(1, 2, 3);
        int k = 3;
        System.out.println(sol.atMostSum(arr, k));  // Output: 2
    }
}