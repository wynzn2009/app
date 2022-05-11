package pris.greedy;

import java.util.Arrays;

public class MinimumSumofFourDigitNumberAfterSplittingDigits2160 {
    public int minimumSum(int num) {
        int[] arr = new int[4];
        int i=0;
        while(i<4){
            arr[i] = num%10;
            num /=10;
            i++;
        }
        Arrays.sort(arr);

        return (arr[0]+arr[1])*10 + arr[2]+arr[3];
    }
}
