package pris.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionofTwoArraysII350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map1.computeIfPresent(nums1[i], (k,v)-> v+1);
            map1.putIfAbsent(nums1[i], 1);
        }
        for(int i=0;i<nums2.length;i++){
            map2.computeIfPresent(nums2[i], (k,v)-> v+1);
            map2.putIfAbsent(nums2[i], 1);
        }
        List<Integer> re = new ArrayList<>();
        for(Integer key : map2.keySet()){
            if(map1.containsKey(key)){
                int cnt = Math.min(map1.get(key), map2.get(key));
                while(cnt-->0){
                    re.add(key);
                }
            }
        }
        int[] result = new int[re.size()];
        int index = 0;
        for(Integer i : re){
            result[index++] = i;
        }
        return result;
    }
}
