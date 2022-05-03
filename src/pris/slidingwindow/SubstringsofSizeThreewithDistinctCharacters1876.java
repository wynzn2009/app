package pris.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class SubstringsofSizeThreewithDistinctCharacters1876 {
    public int countGoodSubstrings(String s) {
        Set<Character> set = new HashSet<>();
        int right = 2;
        int re = 0;
        while(right<s.length()){
            set.add(s.charAt(right-2));
            set.add(s.charAt(right-1));
            set.add(s.charAt(right++));
            if(set.size()==3){
                re++;              
            }
            set.clear();
        }
        return re;
    }
}
