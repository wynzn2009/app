package pris.greedy;

public class TwoFurthestHousesWithDifferentColors2078 {
    public int maxDistance(int[] colors) {
        int left = 0;
        int right = colors.length-1;
        while(left<=right){
            if(colors[left]!=colors[colors.length-1] || colors[right]!= colors[0]){
                return right;
            }
            left++;
            right--;
        }
        return right;
    }
}
