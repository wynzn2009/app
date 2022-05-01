package pris.hash;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber202 {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            int re = help(n);
            if(set.contains(re)){
                return false;
            }
            set.add(re);
            n = re;
        }
        return n == 1;

    }

    private int help(int n) {
        int re = 0;
        while (n > 0) {
            int next = n % 10;
            n = n / 10;
            re += next * next;
        }
        return re;
    }
}
