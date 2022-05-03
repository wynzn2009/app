package pris.slidingwindow;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestandLowestofKScores1984 {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = k-1;
        int min = Integer.MAX_VALUE;
        while(right<nums.length){
            min = Math.min(min, nums[right++]-nums[left++]);
        }
        return min;
    }
}
