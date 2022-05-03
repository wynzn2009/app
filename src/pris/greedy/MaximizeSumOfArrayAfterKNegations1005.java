package pris.greedy;

import java.util.Arrays;

public class MaximizeSumOfArrayAfterKNegations1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        while(k>0){
            if(i<nums.length && nums[i]<0){
                nums[i] = -nums[i];
                k--;
                i++;
            }else if(k%2==1){
                if(i==0){
                    nums[i] = -nums[i];
                }else if(i==nums.length){
                    nums[i-1] = -nums[i-1];
                }else if(nums[i]<nums[i-1]){
                    nums[i] = -nums[i];
                }else{
                    nums[i-1] = -nums[i-1];
                }
                break;
            }else{
                break;
            }
        }
        int sum = 0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
        }
        return sum;
    }
}
