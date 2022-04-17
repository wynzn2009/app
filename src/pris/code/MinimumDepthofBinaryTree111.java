package pris.code;

import java.util.LinkedList;

import pris.model.TreeNode;

public class MinimumDepthofBinaryTree111 {
    public static int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        int depth = 0;
        while(!list.isEmpty()){
            depth++;
            int size = list.size();            
            while(size-->0){
                TreeNode top = list.poll();
                if(top.left == null && top.right == null ){
                    return depth;
                }
                if(top.left!=null){
                    list.offer(top.left);
                }
                if(top.right!=null){
                    list.offer(top.right);
                }
            }
        }
        return depth;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        minDepth(root);
    }
}
