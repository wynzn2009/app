package pris.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import pris.model.TreeNode;

public class AverageofLevelsinBinaryTree637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> re = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int total = queue.size();
            int size = queue.size();
            double sum = 0;
            while(size-->0){
                TreeNode tmp = queue.poll();
                sum += tmp.val/(total * total * 1.0d);
                if(tmp.left!=null){
                    queue.offer(tmp.left);
                }
                if(tmp.right!=null){
                    queue.offer(tmp.right);
                }
            }
            re.add(sum * total);
        }
        return re;
    }
}
