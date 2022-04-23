package pris.stack;

import java.util.LinkedList;

public class MinStack155 {
    LinkedList<Integer> stack = new LinkedList<Integer>();
    LinkedList<Integer> min = new LinkedList<Integer>();

    public MinStack155() {

    }
    
    public void push(int val) {
        stack.push(val);
        if(min.isEmpty() || val <= min.peek()){
            min.push(val);
        }
    }
    
    public void pop() {
        if(stack.isEmpty()){
            return;
        }
        int val = stack.pop();
        if(val == min.peek()){
            min.pop();
        }
    }
    
    public int top() {
        
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
