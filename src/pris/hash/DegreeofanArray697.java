package pris.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DegreeofanArray697 {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            }
            max = Math.max(max, map.get(nums[i]).size());
        }
        int re = Integer.MAX_VALUE;
        for(Integer key : map.keySet()){
            if(map.get(key).size()==max){
                re = Math.min(map.get(key).get(max-1)-map.get(key).get(0)+1, re);
            }
        }
        return re;
    }
}
