import java.util.BitSet;
import java.util.HashSet;

/**
 * Created by Anushila on 3/11/16.
 */
public class isUniqueCharsBitSet {



    public static void main(String args[]){

        String s = "Anushila";
        s= s.toLowerCase();

        System.out.println(isUnique(s));

        HashSet hs = new HashSet();





    }

    private static boolean isUnique(String s) {

        BitSet b = new BitSet();

        for(int i =0;i<s.length();i++){

            int val = s.charAt(i);

            if(b.get(val)){
                return false;
            }
            b.set(val);


        }
        return true;

    }


}
