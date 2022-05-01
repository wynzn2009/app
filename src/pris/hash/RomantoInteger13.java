package pris.hash;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger13 {

    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<String, Integer>() {
            {
                put("IV", 4);
                put("IX", 9);
                put("XL", 40);
                put("XC", 90);
                put("CD", 400);
                put("CM", 900);
                put("I", 1);
                put("V", 5);
                put("X", 10);
                put("L", 50);
                put("C", 100);
                put("D", 500);
                put("M", 1000);
            }
        };
        int i = 0;
        int re = 0;
        while (i < s.length()) {
            if (i + 1 < s.length() && map.containsKey(s.substring(i, i + 2))) {
                re += map.get(s.substring(i, i + 2));
                i += 2;
            } else {
                re +=  map.get(s.substring(i, i + 1));
                i++;
            }
        }
        return re;
    }
}
