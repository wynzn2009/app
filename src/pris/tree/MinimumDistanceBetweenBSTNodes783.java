package pris.tree;

import pris.model.TreeNode;

public class MinimumDistanceBetweenBSTNodes783 {
    int min = Integer.MAX_VALUE;
    int tmp = -1;

    public int minDiffInBST(TreeNode root) {
        help(root);
        return min;
    }

    private void help(TreeNode root) {
        if (root == null) {
            return;
        }
        help(root.left);
        if(tmp!=-1){
            min = Math.min(min, Math.abs(tmp - root.val));
        }
        tmp = root.val;
        help(root.right);
    }
}
