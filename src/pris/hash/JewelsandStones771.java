package pris.hash;

import java.util.HashSet;
import java.util.Set;

public class JewelsandStones771 {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            set.add(jewels.charAt(i));
        }
        int re = 0;
        for(char c : stones.toCharArray()){
            if(set.contains(c)){
                re++;
            }
        }
        return re;
    }
}
