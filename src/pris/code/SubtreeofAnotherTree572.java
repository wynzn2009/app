package pris.code;

import pris.model.TreeNode;

public class SubtreeofAnotherTree572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot != null) {
            return false;
        } else if (subRoot == null) {
            return true;
        }
        return equals(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean equals(TreeNode root, TreeNode subRoot) {
        return (root == null && subRoot == null)
                || ((root != null && subRoot != null) && root.val == subRoot.val && equals(root.left, subRoot.left)
                        && equals(root.right, subRoot.right));
    }
}
