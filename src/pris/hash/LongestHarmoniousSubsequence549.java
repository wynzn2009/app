package pris.hash;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence549 {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i : nums){
            map.computeIfPresent(i, (k,v)->v+1);
            map.putIfAbsent(i, 1);
        }
        int re = 0;
        for(Integer i : map.keySet()){
            if(map.containsKey(i+1)){
                re = Math.max(re, map.get(i)+map.get(i+1));
            }
        }
        return re;
    }
    public static void main(String[] args) {
        LongestHarmoniousSubsequence549 l = new LongestHarmoniousSubsequence549();
        int[] nums = {1,3,2,2,5,2,3,7};
        l.findLHS(nums);
    }
}
