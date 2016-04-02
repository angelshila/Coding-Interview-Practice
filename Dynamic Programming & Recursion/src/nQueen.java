/**
 * Created by Anushila on 3/3/16.
 */

import java.util.ArrayList;
import java.util.List;

public class nQueen {

    public static void main(String args[]){

        List<List<String>> finalans = solveNQueens(4);
        System.out.println(finalans);
    }


    public static List<List<String>> solveNQueens(int n) {

        List<List<String>> result = new ArrayList();
        List<Integer[]> ans = new ArrayList();

        Integer []columns = new Integer[n];

        for (int i = 0; i < n; i++) {
            columns[i] = -1;
        }


        placeQueens(0, columns,ans,n);

        for(int board=0;board<ans.size();board++){

            Integer[] colA = ans.get(board);
            List<String> config = new ArrayList<>();

            for(int i =0;i<n;i++){

                StringBuilder sb = new StringBuilder();

                for(int j=0;j<n;j++){

                    if(colA[i] == j){

                        sb.append("Q");

                    }

                    else{

                        sb.append(".");

                    }


                }

                config.add(sb.toString());

            }

            result.add(config);

        }


        return result;
    }



    public static void placeQueens(int row, Integer[] columns, List<Integer[]> ans, int n ){

        if(row == n){

            ans.add(columns.clone());

        }
        else{

            for(int col=0;col<n;col++){
                if(checkValid(columns,row,col)){
                    columns[row] = col;
                    placeQueens(row+1,columns,ans,n);

                }


            }

        }

    }


    public static boolean checkValid(Integer[] columns, int row1, int column1) {
        for (int row2 = 0; row2 < row1; row2++) {
            int column2 = columns[row2];
			/* Check if (row2, column2) invalidates (row1, column1) as a queen spot. */

			/* Check if rows have a queen in the same column */
            if (column1 == column2) {
                return false;
            }

			/* Check diagonals: if the distance between the columns equals the distance
			 * between the rows, then they’re in the same diagonal. */
            int columnDistance = Math.abs(column2 - column1);
            int rowDistance = row1 - row2; // row1 > row2, so no need to use absolute value
            if (columnDistance == rowDistance) {
                return false;
            }
        }
        return true;
    }




}