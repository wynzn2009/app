package pris.hash;

public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        int tmp = nums[0];
        int cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (tmp == nums[i]) {
                cnt++;
            } else if (cnt > 0) {
                cnt--;
            } else {
                cnt = 1;
                tmp = nums[i];
            }
        }
        return tmp;
    }
}
