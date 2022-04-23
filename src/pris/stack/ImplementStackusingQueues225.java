package pris.stack;

import java.util.LinkedList;

public class ImplementStackusingQueues225 {
    LinkedList<Integer> list1 = new LinkedList<Integer>();
    LinkedList<Integer> list2 = new LinkedList<Integer>();

    public ImplementStackusingQueues225() {

    }
    
    public void push(int x) {
        list1.add(x);
    }
    
    public int pop() {
        while(list1.size()!=1){
            list2.offer(list1.poll());
        }
        int re =  list1.poll();
        list1 = list2 ;
        list2 = new LinkedList<Integer>();
        return re;
    }
    
    public int top() {
        while(list1.size()!=1){
            list2.offer(list1.poll());
        }
        int re =  list1.poll();
        list2.offer(re);
        list1 = list2 ;
        list2 = new LinkedList<Integer>();
        return re;
    }
    
    public boolean empty() {
        return list1.isEmpty();
    }
}
