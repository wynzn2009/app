package pris.hash;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap888 {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int alice = 0;
        int bob = 0;
        int[] re = new int[2];
        for(int a : aliceSizes){
            alice += a;
        }
        for(int a : bobSizes){
            bob += a;
        }
        int div = (alice - bob)/2;
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<bobSizes.length;i++){
            set.add(bobSizes[i]);
        }
        for(int i=0;i<aliceSizes.length;i++){
            if(set.contains(aliceSizes[i]-div)){
                re[0] = aliceSizes[i];
                re[1] = aliceSizes[i]-div;
                return re;
            }
        }
        return re;
    }
}
