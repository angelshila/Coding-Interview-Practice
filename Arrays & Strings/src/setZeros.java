/**
 * Created by Anushila on 3/13/16.
 */

public class setZeros {

    public static void main(String args[]){

        int a[][] = {{1,0}};
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[0].length;j++){


                System.out.print(a[i][j]+"\t");


            }

            System.out.println();
        }

        System.out.println();


        setZeroes(a);

        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[0].length;j++){


                System.out.print(a[i][j]+"\t");


            }

            System.out.println();
        }

        System.out.println();



    }


    public static void setZeroes(int[][] matrix) {

        boolean rowHasZero = false;
        boolean colHasZero = false;

        //Check if 0th row and 0th col have zero
        for(int j=0;j<matrix[0].length;j++){

            if(matrix[0][j] == 0){
                rowHasZero=true;
                break;
            }


        }

        for(int i =0;i<matrix.length;i++){
            if(matrix[i][0] == 0){
                colHasZero = true;
                break;
            }
        }

        //Check for rest of the matrix
        for(int i =1;i<matrix.length;i++){

            for(int j=1;j<matrix[0].length;j++){

                if(matrix[i][j] == 0){

                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }

            }
        }

        //Nullify rows based on 0th column
        for(int i=1;i<matrix.length;i++){
            if(matrix[i][0] == 0){
                nullifyRow(matrix,i);
            }
        }

        //Nullify columns based on 0th row
        for(int j=1;j<matrix[0].length;j++){
            if(matrix[0][j] == 0){
                nullifyCol(matrix,j);
            }
        }


        //Nullify 0th row and col based on flags
        if(rowHasZero){
            nullifyRow(matrix,0);
        }

        if(colHasZero){
            nullifyCol(matrix,0);
        }


    }


    public static void nullifyRow(int matrix[][], int row){

        //for a particular row, make corresponding col values zero
        for(int j=0;j<matrix[0].length;j++){

            matrix[row][j] = 0;

        }


    }

    public static void nullifyCol(int matrix[][], int col){

        //for a particular col, make all corresponding row values zero.
        for(int i=0;i<matrix.length;i++){


            matrix[i][col] = 0;

        }


    }



}