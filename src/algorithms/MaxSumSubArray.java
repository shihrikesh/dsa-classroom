package algorithms;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 0, 1, 2, 3, 0, 2, 1};
        int subArraySize = 3;
        int maxSum = findMaxSumSubArray(subArraySize, arr);
        System.out.println(maxSum);
    }

    private static int findMaxSumSubArray(int subArraySize, int[] arr) {
        // maxSum will keep track of maximum sum of any k-sized subarray
        int maxSum=0;
        int windowSum=0;

        for(int i=0;i<subArraySize;i++){
            windowSum += arr[i];
        }
        maxSum=windowSum;
        for(int i=subArraySize;i<arr.length;i++){
            windowSum+=arr[i]-arr[i-subArraySize];
            if(windowSum>maxSum){
                maxSum=windowSum;
            }
        }
        // return maximum sum of any k-sized subarray
        return maxSum;
    }
}