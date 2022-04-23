package pris.tree;

import pris.model.TreeNode;

public class UnivaluedBinaryTree965 {
    public boolean isUnivalTree(TreeNode root) {
        return help(root, root.val);
    }

    public boolean help(TreeNode root, int tar) {
        if (root == null) {
            return true;
        }
        return root.val == tar && help(root.left, tar) && help(root.right, tar);
    }
}
