package pris.stack;

import java.util.LinkedList;

public class MakeTheStringGreat1544 {
    public String makeGood(String s) {
        char[] chars = s.toCharArray();
        LinkedList<Character> stack = new LinkedList<>();
        int sp = Math.abs('A'-'a');
        for(int i=0;i<chars.length;i++){
            if(stack.isEmpty()){
                stack.push(chars[i]);
            }else if(Math.abs(stack.peek()-chars[i])==sp){
                stack.pop();
            }else{
                stack.push(chars[i]);
            }
        }
        String re = "";
        while(!stack.isEmpty()){
            re = stack.pop() + re;
        }
        return re;
    }
}
