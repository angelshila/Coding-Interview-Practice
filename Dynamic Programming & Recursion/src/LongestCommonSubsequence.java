import java.io.*;
import java.util.*;

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = Integer.valueOf(sc.nextLine().trim());

        System.out.println(n+" "+m);



        String s1= sc.nextLine();
        String s2 = sc.nextLine();

        s1=s1.replace(" ","");
        s2=s2.replace(" ","");
        char a[] = new char[s1.length()];
        char b[] = new char[s2.length()];

        a=s1.toCharArray();
        b=s2.toCharArray();
        int L[][] = new int[n+1][m+1];


        for(int i =0;i<=n;i++){

            L[i][0] = 0;

        }

        for(int j=0;j<=m;j++){

            L[0][j] = 0;

        }





        for(int i =1;i<=n;i++){

            for(int j =1;j<=m;j++){


                if(a[i-1] == b[j-1]){

                    L[i][j] = L[i-1][j-1] +1;
                }

                else{

                    L[i][j] =Math.max(L[i-1][j],L[i][j-1]);

                }

            }


        }

        for(int l=0;l<=n;l++){

            for(int o=0;o<=m;o++){
                System.out.print(L[l][o]+" ");
            }
            System.out.println();

        }

        int i =n , j=m;
        System.out.println(i+" "+j);
        char ans[]=new char[L[n][m]+1];
        int index=L[n][m];
        ans[index]='\0';

        while(i>0 && j>0){
            System.out.println(s1.charAt(i-1));
            System.out.println(s2.charAt(j-1));
            if(a[i-1] == b[i-1]){
                System.out.println("blah1");

                ans[index-1]=a[i-1];
                i--;
                j--;
                index--;


            }

            else if (L[i-1][j]>L[i][j-1]){
                System.out.println("blah2");

                i--;
            }
            else{
                System.out.println("blah3");

                j--;
            }



        }
        for(int k =0;k<ans.length;k++){

            System.out.print(ans[k]+" ");

        }



    }
}