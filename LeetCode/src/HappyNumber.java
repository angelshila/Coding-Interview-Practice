import java.util.HashSet;

/**
 * Created by Anushila on 3/14/16.
 */
public class HappyNumber {

    public static void main(String args[]){


        System.out.print(isHappy1(200));

    }

    public static boolean isHappy1(int n) {

        if(n == 1){

            return true;


        }

        HashSet hs = new HashSet();

        while(!hs.contains(n)){
            hs.add(n);
            int ans=0;

            while(n>0){

                ans+= (int)Math.pow(n%10,2);
                n = n/10;
            }
            n= ans;
            if(n==1){
                return true;
            }


        }

        return false;
    }


    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();

        while(!set.contains(n)){
            set.add(n);

            n = sum(getDigits(n));
            if (n == 1)
                return true;
        }

        return false;
    }

    public static int sum(int[] arr){
        int sum = 0;
        for(int i: arr){
            sum = sum + i*i;
        }
        return sum;
    }

    public static int[] getDigits(int n){
        String s = String.valueOf(n);
        int[] result = new int[s.length()];
        int i=0;

        while(n>0){
            int m = n%10;
            result[i++] = m;
            n = n/10;
        }

        return result;
    }

}
