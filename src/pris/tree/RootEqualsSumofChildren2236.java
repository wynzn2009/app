package pris.tree;

import pris.model.TreeNode;

public class RootEqualsSumofChildren2236 {
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}
