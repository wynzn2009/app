package pris.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSubsequenceinNonIncreasingOrder1403 {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        List<Integer> re = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        sum = sum/2+1;
        for(int i=nums.length-1;i>=0;i--){
            sum -= nums[i];
            re.add(nums[i]);
            if(sum<=0){
                return re;
            }
        }
        return re;
    }
}
