/**
 * Created by Anushila on 3/12/16.
 */
public class oneEdit {

    public static void main(String args[]){

        String first = "pale";
        String second = "bae";

        if(first.length() == second.length()){
            System.out.println(checkOneReplace(first,second));
        }
        else if(first.length()-1 == second.length()){
            System.out.println(checkOneEdit(first,second));
        }
        else if(first.length()+1 == second.length()){
            System.out.println(checkOneEdit(second,first));
        }
        else{
            System.out.print("false");
        }




    }

    private static boolean checkOneReplace(String first, String second) {

        boolean flag = false;
        for(int i =0;i<first.length();i++){

            if(first.charAt(i)!=second.charAt(i)){

                if(flag){
                    return false;
                }
            }
            flag = true;
        }

        return true;

    }

    private static boolean checkOneEdit(String bigger, String smaller) {


        for(int i=0,j=0;i<bigger.length() && j<smaller.length();){

            if(bigger.charAt(i)!=smaller.charAt(j)){

                if(i!=j){
                    return false;
                }

                i++;
            }
            else{
                i++;
                j++;
            }

        }

        return true;
    }


}
