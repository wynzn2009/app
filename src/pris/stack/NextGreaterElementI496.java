package pris.stack;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class NextGreaterElementI496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        LinkedList<Integer> stack = new LinkedList<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                map.put(nums2[i], -1);
            } else if (nums2[i] > stack.peek()) {
                while(!stack.isEmpty() &&  nums2[i] > stack.peek() ){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    map.put(nums2[i], -1);
                }else{
                    map.put(nums2[i], stack.peek());
                }
            } else {
                map.put(nums2[i], stack.peek());
            }
            stack.push(nums2[i]);
        }
        int[] re = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            re[i] = map.get(nums1[i]);
        }
        return re;

    }
}
