import java.util.ArrayList;

public class subsetSumDP{

    private static ArrayList<Integer> subset = new ArrayList<>();



    public static void main(String args[]){

        int set[] = {2,3,7,8,10};
        int sum = 11;
        if (isSubsetSum(set,sum) == true)
            System.out.println("Found a subset with given sum");
        else
            System.out.println("No subset with given sum");
    }


    public static boolean isSubsetSum(int A[],int sum){


        int n = A.length;
        int m = sum;

        boolean S[][] = new boolean[n+1][m+1];


        for(int i =0;i<=n;i++){

            S[i][0]=true;

        }



        for(int i =1;i<=n;i++){

            for(int j=1;j<=m;j++){


                S[i][j] = S[i-1][j];

                //number sum >= element
                if(j>= A[i-1]){

                    S[i][j] = S[i][j] || S[i-1][j-A[i-1]];


                }



            }

        }

        printSubsets(S,A,sum);



        return S[n][m];







    }

    private static void printSubsets(boolean[][] S, int[] A, int sum) {


        int i = A.length-1;
        int j = sum;


       if(!S[i][j]){

           j= j-A[i];

       }


        while(i>0 && j>0){



            if(!S[i-1][j]){

                subset.add(A[i-1]);
                j-=A[i-1];
                i-=1;
            }

            else{
                i-=1;
            }


        }










    }


}