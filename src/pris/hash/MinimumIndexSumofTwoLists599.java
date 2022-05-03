package pris.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumofTwoLists599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int sum = Integer.MAX_VALUE;
        Map<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i], -i);
        }
        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
                map.put(list2[i], Math.abs(map.get(list2[i])) + i);
                sum = Math.min(sum, map.get(list2[i]));
            }
        }
        List<String> re = new ArrayList<>();
        for(String str : map.keySet()){
            if(map.get(str)==sum){
                re.add(str);
            }
        }
        String[] result = new String[re.size()];
        return re.toArray(result);

    }
}
