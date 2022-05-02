package pris.hash;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> re = new ArrayList<>();
        int[] arr = new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[nums[i]-1]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                re.add(i+1);
            }
        }
        return re;
    }
}
