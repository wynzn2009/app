package pris.tree;

import java.util.ArrayList;
import java.util.List;

import pris.model.TreeNode;

public class BinaryTreePostorderTraversal145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        help(root, list);
        return list;
    }
    private void help(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        help(root.left,list);
        help(root.right,list);
        list.add(root.val);
    }
}
