package pris.stack;

import java.util.LinkedList;

public class BaseballGame682 {
    public int calPoints(String[] ops) {
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 0; i < ops.length; i++) {
            String op = ops[i];
            switch (op) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    int first = stack.pop();
                    int sum = first + first;
                    stack.push(first);
                    stack.push(sum);
                    break;
                case "+":
                    int first1 = stack.pop();
                    int second1 = stack.pop();
                    int sum1 = first1 + second1;
                    stack.push(second1);
                    stack.push(first1);
                    stack.push(sum1);
                    break;
                default:
                    stack.push(Integer.valueOf(op));
                    break;
            }
        }
        int re = 0;
        while(!stack.isEmpty()){
            re += stack.pop();
        }
        return re;
    }
}
