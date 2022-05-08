package pris.greedy;

import java.util.Arrays;

public class MinimumCostofBuyingCandiesWithDiscount2144 {
    public int minimumCost(int[] cost) {
        int re = 0;
        Arrays.sort(cost);
        for(int i=cost.length-1;i>=0;i-=3){
            if(i>=1){
                re += cost[i];
                re += cost[i-1];
            }else{
                while(i>=0){
                    re += cost[i--];
                }
            }
        }
        return re;
    }
}
