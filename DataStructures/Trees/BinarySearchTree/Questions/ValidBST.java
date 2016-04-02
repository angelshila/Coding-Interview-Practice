package Questions;

import Basics.*;

/**
 * Created by Anushila on 3/19/16.
 */
public class ValidBST {

    public Integer prev = null;
    public boolean isValidBST(TreeNode root) {

        if(root == null){
            return true;
        }


        //check left
        if(!isValidBST(root.left))
            return false;

        //check current
        if(prev!=null && root.data<=prev)
            return false;

        prev = root.data;

        //check right
        if(!isValidBST(root.right))
            return false;

        return true;


    }

}
