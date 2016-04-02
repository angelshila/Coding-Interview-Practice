/**
 * Created by Anushila on 3/12/16.
 */
public class palindromePermutation {



    public static void main(String args[]){

        String s = "Rats live on no evil star";

        System.out.println(palindromicPermutation(s));

    }


    public static boolean palindromicPermutation(String s){

        int bitvector = 0;

        for(char c: s.toCharArray()){

            if((bitvector & (1<<c))==0){
                bitvector|=1<<c;
            }
            else{
                bitvector&=~(1<<c);
            }

        }

        return bitvector==0 || checkBit(bitvector);
    }

    private static boolean checkBit(int bitvector) {

        return ((bitvector & (bitvector-1)) == 0);

    }


}
