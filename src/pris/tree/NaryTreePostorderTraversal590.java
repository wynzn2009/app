package pris.tree;

import java.util.ArrayList;
import java.util.List;

import pris.model.Node;

public class NaryTreePostorderTraversal590 {

    List<Integer> re = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if(root == null){
            return re;
        }
        for(Node child : root.children){
            postorder(child);
        }
        re.add(root.val);
        return re;
    }
}
