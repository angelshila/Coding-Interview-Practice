/**
 * Created by Anushila on 3/11/16.
 */
import java.lang.*;
public class palindrome {

    public static void main(String args[]){

        String s ="booo b ";
        s = s.replaceAll("[^A-Za-z0-9]","");

        int i=0,j=s.length()-1;
        boolean flag = true;
        while(j>i){

            if(s.charAt(i)!=s.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;



        }

        if(flag!=true){
            System.out.println("NP");
        }

    }
}
