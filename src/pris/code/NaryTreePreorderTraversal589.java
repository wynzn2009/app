package pris.code;

import java.util.ArrayList;
import java.util.List;

import pris.model.Node;

public class NaryTreePreorderTraversal589 {
    List<Integer> re = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root == null){
            return re;
        }
        re.add(root.val);
        for(Node child : root.children){
            preorder(child);
        }
        return re;
    }
}
