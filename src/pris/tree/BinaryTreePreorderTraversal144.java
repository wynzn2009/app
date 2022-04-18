package pris.tree;

import java.util.ArrayList;
import java.util.List;

import pris.model.TreeNode;

public class BinaryTreePreorderTraversal144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        help(root, list);
        return list;
    }
    private void help(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.val);
        help(root.left,list);
        help(root.right,list);
    }
}
