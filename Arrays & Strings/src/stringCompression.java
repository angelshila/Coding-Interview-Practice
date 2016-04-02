/**
 * Created by Anushila on 3/12/16.
 */
public class stringCompression {

    public static void main(String args[]){

        String str = "aabbbccccc";
        System.out.println(str);
        System.out.println(countCompression(str));



    }

    private static String countCompression(String s){

        //first check whether compressed string's length is lesser than current string.
        int newLength = countLength(s);

        return newLength>=s.length()? s:rle(s,newLength);



    }

    private static String rle(String s, int len) {

        StringBuilder sb = new StringBuilder(len);
        int count =0;


        for(int i =0;i<s.length();i++){

            count++;

            if(i+1>=s.length() || s.charAt(i+1) != s.charAt(i)){
                sb.append(s.charAt(i));
                sb.append(count);
                count=0;
            }




        }

        return sb.toString();

    }

    private static int countLength(String s) {

        int count=0;
        int countLength=0;
        for(int i =0;i<s.length();i++){


            count++;
            if(i+1>=s.length() || (s.charAt(i+1) != s.charAt(i))){

                countLength+=1+String.valueOf(count).length();
                count=0;




            }


        }


        return countLength;


    }


}
