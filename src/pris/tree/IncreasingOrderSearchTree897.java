package pris.tree;

import pris.model.TreeNode;

public class IncreasingOrderSearchTree897 {
    TreeNode re = new TreeNode(0);
    TreeNode head = re;
    public TreeNode increasingBST(TreeNode root) {
        help( root);
        return re.right;
    }

    private void help(TreeNode root) {
        if (root == null) {
            return;
        }
        help( root.left);
        head.right = new TreeNode(root.val);
        head = head.right;
        help( root.right);
    }
}
