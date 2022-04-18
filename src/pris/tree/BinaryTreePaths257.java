package pris.tree;

import java.util.ArrayList;
import java.util.List;

import pris.model.TreeNode;

public class BinaryTreePaths257 {
    public List<String> binaryTreePaths(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        List<String> re = new ArrayList<>();
        help(sb,re,root);
        return re;
    }

    private void help(StringBuffer sb,List<String> re,TreeNode root){
        if(root == null){
            return;
        }
        String appendStr = "";
        if(root!=null){
            if(sb.length()>0){
                appendStr = "->" + String.valueOf(root.val);
            }else{
                appendStr = String.valueOf(root.val);
            }
            sb.append(appendStr);
        }
        if(root.left == null && root.right == null){
            re.add(sb.toString());
        }
        if(root.left != null){
            help(sb,re,root.left);
        }
        if(root.right != null){
            help(sb,re,root.right);
        }
        sb.delete(sb.length() - appendStr.length(), sb.length());
    }
}
