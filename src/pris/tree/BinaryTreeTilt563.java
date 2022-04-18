package pris.tree;

import pris.model.TreeNode;

public class BinaryTreeTilt563 {
    int sum = 0;
    public int findTilt(TreeNode root) {
        if(root == null ){
            return 0;
        }
        treeSum(root);
        return sum;
    }

    private int treeSum(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = treeSum(root.left);
        int right = treeSum(root.right);
        sum += Math.abs(left-right);
        return root.val + left + right;
    }
}
