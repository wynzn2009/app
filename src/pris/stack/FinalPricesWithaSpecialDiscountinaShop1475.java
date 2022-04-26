package pris.stack;

import java.util.LinkedList;

public class FinalPricesWithaSpecialDiscountinaShop1475 {
    public int[] finalPrices(int[] prices) {
        int[] re = new int[prices.length];
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = prices.length - 1; i >= 0; i--) {
            if(stack.isEmpty() ){
                re[i] = prices[i];
                stack.push(prices[i]);
            }else if(prices[i] > stack.peek()){
                re[i] = prices[i] - stack.peek();
                stack.push(prices[i]);
            }else if(prices[i] < stack.peek()){
                stack.pop();
                re[i] = -1;
                while(!stack.isEmpty()){
                    if(prices[i] > stack.peek()){
                        re[i] = prices[i] - stack.peek();
                        stack.push(prices[i]);
                        break;
                    }else if(prices[i] == stack.peek()){
                        re[i] = 0;
                        break;
                    }else{
                        stack.pop();
                    }
                }
                if(re[i] == -1){
                    re[i] = prices[i];
                    stack.push(prices[i]);
                }
            }else{
                re[i] = 0;
            }
        }
        return re;
    }
    public static void main(String[] args) {
        FinalPricesWithaSpecialDiscountinaShop1475 f = new FinalPricesWithaSpecialDiscountinaShop1475();
        int[] prices = {8,4,6,2,3};
        f.finalPrices(prices);
    }
}
