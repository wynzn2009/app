package pris.tree;

import pris.model.TreeNode;

public class SecondMinimumNodeInaBinaryTree671 {

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null || root.left == null) {
            return -1;
        }
        if (root.left.val == root.right.val) {
            int left = findSecondMinimumValue(root.left);
            int right = findSecondMinimumValue(root.right);
            if (left == -1) {
                return right;
            }
            if (right == -1) {
                return left;
            }
            return Math.min(left, right);
        } else if (root.left.val > root.right.val) {
            int right = findSecondMinimumValue(root.right);
            if (right == -1) {
                return root.left.val;
            }
            return Math.min(root.left.val, findSecondMinimumValue(root.right));
        } else {
            int left = findSecondMinimumValue(root.left);
            if (left == -1) {
                return root.right.val;
            }
            return Math.min(root.right.val, findSecondMinimumValue(root.left));
        }
    }
}
