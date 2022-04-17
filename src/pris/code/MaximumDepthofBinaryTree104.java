package pris.code;

import pris.model.TreeNode;

public class MaximumDepthofBinaryTree104 {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
