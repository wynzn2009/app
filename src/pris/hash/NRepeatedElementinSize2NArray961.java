package pris.hash;

import java.util.HashSet;
import java.util.Set;

public class NRepeatedElementinSize2NArray961 {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (set.contains(i)) {
                return i;
            }else {
                set.add(i);
            }
        }
        return 0;
    }
}
