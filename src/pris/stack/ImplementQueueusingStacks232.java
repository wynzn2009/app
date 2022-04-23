package pris.stack;

import java.util.LinkedList;

public class ImplementQueueusingStacks232 {
    LinkedList<Integer> q1 = new LinkedList<Integer>();
    LinkedList<Integer> q2 = new LinkedList<Integer>();
    public ImplementQueueusingStacks232() {

    }
    
    public void push(int x) {
        q1.push(x);
    }
    
    public int pop() {
        while(q1.size()!=1){
            q2.push(q1.pop());
        }
        int re =  q1.pop();
        while(!q2.isEmpty()){
            q1.push(q2.pop());
        }
        q2 = new LinkedList<Integer>();
        return re;
    }
    
    public int peek() {
        while(q1.size()!=1){
            q2.push(q1.pop());
        }
        int re =  q1.pop();
        q2.push(re);
        while(!q2.isEmpty()){
            q1.push(q2.pop());
        }
        q2 = new LinkedList<Integer>();
        return re;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}
