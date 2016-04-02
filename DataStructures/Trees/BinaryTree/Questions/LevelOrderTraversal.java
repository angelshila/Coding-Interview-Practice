package Questions;

import Basics.*;
import java.util.*;

/**
 * Created by Anushila on 3/19/16.
 */
public class LevelOrderTraversal {


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList();

        if(root == null){
            return res;
        }


        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        q.offer(null);
        List<Integer> inner = new ArrayList();

        while(!q.isEmpty()){
            ArrayList list = new ArrayList(q);
            //System.out.println("q"+list);
            TreeNode node = q.poll();


            if(node == null){

                if(inner.size()>0){
                    res.add(inner);
                }
                if(q.peek()!=null){
                    q.offer(null);
                }

                // System.out.println("outer"+res);
                inner = new ArrayList();
            }

            else{
                // System.out.println("val"+node.val);
                inner.add(node.data);
                //System.out.println("inner"+inner);

                if(node.left!=null){
                    q.offer(node.left);
                }

                if(node.right!=null){
                    q.offer(node.right);
                }


            }


        }

        return res;

    }

}
