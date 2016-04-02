/**
 * Created by Anushila on 3/14/16.
 */
public class maxSumSubarray {

    public static int maxSubArray(int[] A) {

        int startIndex=0;
        int endIndex =0;
        int newsum=A[0];
        int max=A[0];
        for(int i=1;i<A.length;i++){
            newsum=Math.max(newsum+A[i],A[i]);
            max= Math.max(max, newsum);

            if (max == A[i])
            {
                startIndex = i;
            }
            else if (max == newsum)
            {
                endIndex = i;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {1,1,2,-8,3};
        System.out.println(maxSubArray(a));
    }



}
