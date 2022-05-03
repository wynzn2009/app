package pris.slidingwindow;

public class MaximumAverageSubarrayI643 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int max = 0;
        int left = 0;
        int right = k;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        max = sum;
        while (right < nums.length) {
            sum = sum + nums[right++] - nums[left++];
            max = Math.max(max, sum);
        }
        return max / (double) k;
    }

    public static void main(String[] args) {
        MaximumAverageSubarrayI643 m = new MaximumAverageSubarrayI643();
        int[] nums = { 1, 12, -5, -6, 50, 3 };
        m.findMaxAverage(nums, 4);
    }
}
