import java.util.Random;

/**
 * Created by Anushila on 3/13/16.
 */
public class rotateMatrix {

    public static void main(String args[]){

        Random rn = new Random();
        int n = rn.nextInt(10);
        int a[][] = new int[n][n];

        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[0].length;j++){


               a[i][j]=rn.nextInt(10);


            }


        }


        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[0].length;j++){


                System.out.print(a[i][j]+"\t");


            }

            System.out.println();
        }

        System.out.println();

        rotate(a);


        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[0].length;j++){


                System.out.print(a[i][j]+"\t");


            }

            System.out.println();
        }

        System.out.println();



    }

    public static void rotate(int[][] matrix) {

        //not a square
        if(matrix.length == 0 || matrix.length!=matrix[0].length){

            return;
        }

        int n = matrix.length;

        for(int layer=0;layer<n/2;layer++){
            int first = layer;
            //last will be last element position minus the current layer
            int last = n-1-layer;

            for(int i =first;i<last;i++){
                int offset = i - first;


                //Save top. we are going clockwise, row remains same throughout, but column increases.
                int top = matrix[first][i];

                //left to top. Left's row decreases and column remains same
                matrix[first][i] = matrix[last-offset][first];

                //bottom to left. Bottom's column decreases, row remains same.
                matrix[last-offset][first] = matrix[last][last-offset];

                //right to bottom. Right's row increases, column remains same.
                matrix[last][last-offset] = matrix[i][last];

                //top to right.
                matrix[i][last] = top;


            }


        }




    }

}
