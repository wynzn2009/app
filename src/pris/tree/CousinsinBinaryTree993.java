package pris.tree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import pris.model.TreeNode;

public class CousinsinBinaryTree993 {
    public boolean isCousins(TreeNode root, int x, int y) {
        Set<Integer> set = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            while (n-- > 0) {
                TreeNode q = queue.poll();
                if (q.left != null && q.right != null
                        && ((q.left.val == x && q.right.val == y) || (q.right.val == x && q.left.val == y))) {
                    return false;
                }
                if (q.left != null) {
                    queue.offer(q.left);
                    set.add(q.left.val);
                }
                if (q.right != null) {
                    queue.offer(q.right);
                    set.add(q.right.val);
                }
            }
            if(set.contains(x) && set.contains(y)){
                return true;
            }else{
                set.clear();
            }
        }
        return false;
    }
}
