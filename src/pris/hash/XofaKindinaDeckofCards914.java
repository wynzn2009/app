package pris.hash;

import java.util.HashMap;
import java.util.Map;

public class XofaKindinaDeckofCards914 {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : deck) {
            map.computeIfPresent(i, (k, v) -> v + 1);
            map.putIfAbsent(i, 1);
        }
        int sum = 0;
        for (Integer i : map.keySet()) {
            if (sum == 0) {
                sum = map.get(i);
            } else if (help(sum,map.get(i))>1) {
                sum = help(sum,map.get(i));
            }else{
                return false;
            }
        }
        return sum > 1;
    }

    private int help(int a,int b){
        if(a%b==0||b%a==0){
            return Math.min(a, b);
        }else{
            return help(Math.abs(a-b),Math.min(a, b));
        }
    }
}
