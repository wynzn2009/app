package pris.hash;

import java.util.Arrays;

public class SetMismatch645 {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] re = new int[2];
        int sum = 0;
        int tmp = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==tmp){
                re[0] = tmp;
            }else{
                sum+=nums[i];
            }
            tmp = nums[i];
        }
        re[1] = nums.length*(nums.length+1)/2 - sum;
        return re;
    }
}
