package pris.tree;

import java.util.ArrayList;
import java.util.List;

import pris.model.TreeNode;

public class LeafSimilarTrees872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        help(list1,root1);
        help(list2,root2);
        if(list1.size()!= list2.size()){
            return false;
        }
        int s = list1.size();
        while(s-->0){
            if(!list1.get(s).equals(list2.get(s))){
                return false;
            }
        }
        return true;
    }

    private void help(List<Integer> list,TreeNode root){
        if(root == null){
            return;
        }
        help(list,root.left);
        if(root.left == null && root.right == null){
            list.add(root.val);
        }
        help(list,root.right);
    }
}
