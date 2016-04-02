/**
 * Created by Anushila on 3/22/16.
 */
public class fibonacci {

    public static void main(String args[]){

        System.out.println(fib(5));


    }







    public static int fib (int n) {
        int fib = 0;
        int a = 1;
        int b=0;
        for(int i=2; i<=n; i++) {
            fib = a+b;
            b=a;
            a=fib;

        }
        return fib;
    }


}
