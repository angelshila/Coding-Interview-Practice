
/**
 * Created by Anushila on 3/11/16.
 */
public class isUniqueCharsBitVector {


    public static void main(String args[]){

        String s = "Anushila";
        s= s.toLowerCase();

        System.out.println(isUnique(s));




    }

    private static boolean isUnique(String s) {


        int checker =0;

        for(int i =0;i<s.length();i++){

            int val = s.charAt(i);

            if((checker & (1 <<val))>0){
                return false;
            }
            checker = checker | (1<<val);


        }

        return true;

    }




}
