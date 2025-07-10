package algorithms.peakFinders;

public class PeakFInderA {

    /**
     * FInd a peak (if it exist)
     * @param args
     */
    public static void main(String[] args) {

        // linear approach

        // we compare each element to find if one is >= to other

        // compare each element with its neabour

        int[] arr = new int[]{1,3,7,5,6,4};
        int[] arr1 = new int[]{1,2,1,3,5,6,4};
        int[] arr2 = new int[]{5,4,3,4,5};
        int peak=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>=arr[peak]){
                peak=i;
            }
        }

        System.out.println(peak);

        //System.out.println(divideAndConquer(arr1));
        System.out.println(divideAndConquer(arr2));



    }

    // below algorithm will retrun a peak, means only one peal, hear 6 and 7 both are peak, but we returned 6
    public static int divideAndConquer(int[] arr){
        int peak=0;
        int low=0;
        int high=arr.length-1;
        int mid=high/2;
        if(arr.length==2){
            return arr[0]>=arr[1]?0:1;
        }

        for(int i=low;i< arr.length;i++){

            if(arr[mid-1]>=arr[mid]){
                high=mid-1;
                peak=mid-1;
                mid=mid-high;
            } else if (arr[mid+1]>=arr[mid]) {
                low=mid+1;
                peak=mid+1;
                mid=mid+high-low;
            } else {
                peak=mid;
            }

        }
        return peak;
    }
}
