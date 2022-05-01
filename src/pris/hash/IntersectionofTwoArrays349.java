package pris.hash;

import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                set2.add(nums2[i]);
            }
        }
        int[] re = new int[set2.size()];
        int i = 0;
        for (Integer in : set2) {
            re[i++] = in;
        }
        return re;
    }
}
