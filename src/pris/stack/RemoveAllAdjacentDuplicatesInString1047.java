package pris.stack;

import java.util.LinkedList;

public class RemoveAllAdjacentDuplicatesInString1047 {
    public String removeDuplicates(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        char[] chars = s.toCharArray();
        for (Character c : chars) {
            if (stack.isEmpty() || c != stack.peek()) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        String re = "";
        while (!stack.isEmpty()) {
            re = stack.pop() + re;
        }
        return re;
    }
}
