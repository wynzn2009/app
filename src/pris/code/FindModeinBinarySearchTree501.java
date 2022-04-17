package pris.code;

import java.util.ArrayList;
import java.util.List;

import pris.model.TreeNode;

public class FindModeinBinarySearchTree501 {

    public int count = 0;
    public int current = 0;
    public int max = -1;
    public int[] findMode(TreeNode root) {
        List<Integer> re = new ArrayList<>();
        help(re, root);
        if(count>max){
            re.clear();
            re.add(current);
        }else if(count==max){
            re.add(current);
        }
        int[] result = new int[re.size()];
        for(int i=0;i<re.size();i++){
            result[i] = re.get(i);
        }
        return result;
    }
    private void help(List<Integer> re , TreeNode root){
        if(root == null){
            return;
        }
        help(re,root.left);
        int c = root.val;
        if(max == -1){
            current = c;
            max = 0;
            count = 0;
        }
        if(c == current){
            count++;            
        }else if(count == max){
            re.add(current);
            current = c;
            count = 1;
        }else if(count>max){
            re.clear();
            re.add(current);
            max = count;
            current = c;
            count = 1;
        }else {
            current = c;
            count = 1;
        }
        help(re,root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        FindModeinBinarySearchTree501 a = new FindModeinBinarySearchTree501();
        a.findMode(root);
    }
}
