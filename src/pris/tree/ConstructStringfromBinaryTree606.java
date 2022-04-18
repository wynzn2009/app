package pris.tree;

import pris.model.TreeNode;

public class ConstructStringfromBinaryTree606 {
        
    public String tree2str(TreeNode root) {
        String re = "";
        if(root == null){
            return re;
        }
        re += root.val;
        String left = tree2str(root.left);
        String right = tree2str(root.right);
        if(!"".equals(right)){
            re = re + "(" + left + ")";
            re = re + "(" + right + ")";
        }else if(!"".equals(left)){
            re = re + "(" + left + ")";
        }
        return re;
    }
}
