package pris.greedy;

public class MinimumOperationstoMaketheArrayIncreasing1827 {
    public int minOperations(int[] nums) {
        int re = 0;
        int tmp = 0;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                re =0;
                tmp = nums[i];
                continue;
            }else{
                re += nums[i]>tmp?0:tmp-nums[i]+1;
                tmp = nums[i]>tmp?nums[i]:tmp+1;
            }
        }
        return re;
    }
    public static void main(String[] args) {
        MinimumOperationstoMaketheArrayIncreasing1827 m = new MinimumOperationstoMaketheArrayIncreasing1827();
        int[] nums = {1,1,1};
        m.minOperations(nums);
    }
}
