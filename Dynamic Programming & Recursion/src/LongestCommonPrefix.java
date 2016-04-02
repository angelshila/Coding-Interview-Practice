
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestCommonPrefix {

    public static void main(String args[])throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ch;
        do{
            System.out.println("Menu:\n1.String Array\n2.Just 2 strings\n3.Exit\nChoose one option!");
            ch=Integer.parseInt(br.readLine());
            switch(ch){

                case 1:
                    String a=lcpstringarray();
                    System.out.println(a);
                    break;

                case 2:
                    String b=lcpstrings();
                    System.out.println(b);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Error!");

            }

        }while(ch!=3);
    }

    private static String lcpstrings() {
        String s1="axbba", s2="axbc";
        int minlength = Math.min(s1.length(), s2.length());

        for (int i=0; i<minlength; i++){

            if(s1.charAt(i)!=s2.charAt(i)){
                return s1.substring(0,i);
            }
        }
        return s1.substring(0,minlength);

    }

    private static String lcpstringarray() {

        String str[]={"axbba","axb","axbx","axbcd","ax"};
        int minlength=Integer.MAX_VALUE;
        for(String s:str){

            if(minlength > s.length()){
                minlength=s.length();
            }
        }

        if (minlength == 0){
            System.out.println();
        }
        for(int i=0;i<minlength;i++){
            char prev = '0';
            for(int j=0;j<str.length;j++){
                if(j==0){
                    prev=str[j].charAt(i);
                    continue;
                }
                if(str[j].charAt(i)!=prev){
                    return str[j].substring(0, i);
                }
            }

        }
        return str[0].substring(0, minlength);

    }

}
