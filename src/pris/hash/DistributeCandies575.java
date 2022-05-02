package pris.hash;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies575 {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(Integer i : candyType){
            set.add(i);
        }
        return Math.min(candyType.length/2, set.size());
    }
}
