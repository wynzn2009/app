package pris.tree;

import java.util.List;

import pris.model.Node;

public class MaximumDepthofNaryTree559 {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        List<Node> list = root.children;
        int max = 0;
        for (Node node : list) {
            max = Math.max(max, maxDepth(node));
        }
        return max + 1;
    }

}
