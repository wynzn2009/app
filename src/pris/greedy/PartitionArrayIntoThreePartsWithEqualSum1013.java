package pris.greedy;

public class PartitionArrayIntoThreePartsWithEqualSum1013 {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        int[] to = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            to[i] = sum;
        }
        if (sum % 3 != 0) {
            return false;
        } else {
            int target = sum / 3;
            int curr = target;
            int re = 0;
            for (int i = 0; i < to.length; i++) {
                if (to[i] == curr) {
                    re++;
                    curr += target;
                }
            }
            return re >= 3;
        }
    }
}
