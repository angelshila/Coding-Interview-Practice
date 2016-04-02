/**
 * Created by Anushila on 3/14/16.
 */
public class addDigits {


    public static void main(String args[]){

        System.out.println(addDigits(384));
    }

    public static int addDigits(int num) {

        if(num<10){
            return num;
        }


        while(num>=10){

            num=num%10 + num/10;


        }

        return num;



    }

}
