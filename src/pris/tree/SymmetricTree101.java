package pris.tree;

import pris.model.TreeNode;

public class SymmetricTree101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return help(root.left, root.right);
    }

    private boolean help(TreeNode left, TreeNode right) {
        if (null == left && null == right) {
            return true;
        }
        if (null == left || null == right) {
            return false;
        }
        return left.val == right.val && help(left.left, right.right) && help(left.right, right.left);
    }
}
