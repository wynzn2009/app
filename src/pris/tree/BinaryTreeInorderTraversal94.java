package pris.tree;

import java.util.ArrayList;
import java.util.List;

import pris.model.TreeNode;

public class BinaryTreeInorderTraversal94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> re = new ArrayList<>();
        help(root,re);
        return re;
    }

    private void help(TreeNode root , List<Integer> re){
        if(null == root ){
            return ;
        }
        help(root.left,re);
        re.add(root.val);
        help(root.right,re);
    }
}
