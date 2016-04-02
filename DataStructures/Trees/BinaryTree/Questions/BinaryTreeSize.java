package Questions;
import Basics.*;

/**
 * Created by Anushila on 3/19/16.
 */
public class BinaryTreeSize {

    public int size(TreeNode root){

        int leftCount = root.left==null?0:size(root.left);
        int rightCount = root.right == null?0:size(root.right);
        return 1+leftCount+rightCount;

    }


}
