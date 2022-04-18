package pris.tree;

import pris.model.TreeNode;

public class SumofLeftLeaves404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null){
            return sumOfLeftLeaves(root.right);
        }
        if(root.left != null){
            if(root.left.left==null && root.left.right==null){
                return root.left.val + sumOfLeftLeaves(root.right);
            }else{
                return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
            }
        }
        return 0;
    }
}
