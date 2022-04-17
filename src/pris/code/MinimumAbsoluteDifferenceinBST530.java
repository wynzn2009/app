package pris.code;

import pris.model.TreeNode;

public class MinimumAbsoluteDifferenceinBST530 {
    int min = Integer.MAX_VALUE;
    int tmp = -1;
    public int getMinimumDifference(TreeNode root) {
        help(root);
        return min;
    }

    public void help(TreeNode root){
        if(root == null){
            return;
        }
        help(root.left);
        int c = root.val;
        if(tmp == -1){
            tmp = c;
        }else{
            min = Math.min(min, c-tmp);
            tmp = c;
        }
        help(root.right);
    }
}
