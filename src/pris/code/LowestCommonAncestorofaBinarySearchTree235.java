package pris.code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import pris.model.TreeNode;

public class LowestCommonAncestorofaBinarySearchTree235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        LinkedList<TreeNode> left = new LinkedList<>();
        LinkedList<TreeNode> right = new LinkedList<>();
        contains(left, root, p);
        contains(right, root, q);
        int n = Math.min(left.size(), right.size());
        int index = 0;
        while (index < n) {
            if (left.get(index) != right.get(index)) {
                return left.get(index - 1);
            }
            index++;
        }
        return left.get(index - 1);
    }

    private boolean contains(LinkedList<TreeNode> list, TreeNode root, TreeNode p) {
        if (root == null) {
            return false;
        }
        if (root == p) {
            list.push(root);
            return true;
        }
        if (contains(list, root.left, p) || contains(list, root.right, p)) {
            list.push(root);
            return true;
        } else {
            return false;
        }

    }

    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {

        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor1(root.left, p, q);
        } else if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor1(root.right, p, q);
        } else {
            return root;
        }
    }

}
