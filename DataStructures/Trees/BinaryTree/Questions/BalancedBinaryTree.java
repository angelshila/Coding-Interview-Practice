package Questions;

import Basics.*;

/**
 * Created by Anushila on 3/19/16.
 */
public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {

        return checkBalanced(root)!=Integer.MAX_VALUE;

    }

    public int checkBalanced(TreeNode root){

        if(root == null){
            return -1;
        }


        int leftHt = checkBalanced(root.left);

        if(leftHt == Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }

        int rightHt = checkBalanced(root.right);

        if(rightHt == Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }

        int diffHt = Math.abs(leftHt - rightHt);

        if(diffHt>1){

            return Integer.MAX_VALUE;

        }

        return Math.max(leftHt,rightHt)+1;

    }

}
