package pris.tree;

import pris.model.TreeNode;

public class DiameterofBinaryTree543 {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(help(root.left)+ help(root.right),
                Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right)));
    }

    private int help(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(help(root.left), help(root.right)) + 1;
    }

    int result = 0;
    public int diameterOfBinaryTree1(TreeNode root) {
        help1(root);
        return result;
    }

    private int help1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = help1(root.left);
        int right = help1(root.right);
        int arount = Math.max(left, right) + 1;
        result = Math.max(result, left+right);
        return arount;
    }   
}
