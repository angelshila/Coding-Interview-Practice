import java.util.*;

public class LongestCommonSubstring {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the two strings for Longest Common Substring!");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        // ignore case
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        //Trying to call the logic function using classes and objects
        LongestCommonSubstring obj= new LongestCommonSubstring();
        obj.lcs(s1,s2);

    }

    public void lcs(String s1, String s2) {

        int substringmatrix[][]=new int[s1.length()+1][s2.length()+1];
        int position=0, maxlength=0;

        for (int i=1; i<substringmatrix.length; i++){

            for (int j=1; j<substringmatrix[0].length; j++){

                if (s1.charAt(i-1) == s2.charAt(j-1)){

                    substringmatrix[i][j] = substringmatrix[i-1][j-1]+1;

                    if (maxlength < substringmatrix[i][j]){

                        maxlength = substringmatrix[i][j]; //storing the max length of a substring till now
                        position = i; //saving the longest ith index has gone i.e. for longest substring
                    }
                }

                else{

                    substringmatrix[i][j] = 0; //length is not changing i.e. already found substring of that length

                }
            }

        }

        System.out.println(maxlength);
        System.out.println(position);
        System.out.println(s1.substring(position-maxlength, position));

    }



}
