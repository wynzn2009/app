package pris.greedy;

import java.util.Arrays;

public class LargestPerimeterTriangle976 {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int i=nums.length-3;
        while(i>=0){
            if(nums[i]+nums[i+1]>nums[i+2]){
                return nums[i]+nums[i+1]+nums[i+2];
            }else{
                i--;
            }
        }
        return 0;
    }
}
