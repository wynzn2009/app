package pris.tree;

import pris.model.TreeNode;

public class RangeSumofBST938 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        if (root == null) {
            return 0;
        }
        if (root.val >= low) {
            sum += rangeSumBST(root.left, low, high);
        }
        if (root.val <= high) {
            sum += rangeSumBST(root.right, low, high);
        }
        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }
        return sum;
    }

}