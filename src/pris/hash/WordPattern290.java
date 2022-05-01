package pris.hash;

import java.util.HashMap;
import java.util.Map;

public class WordPattern290 {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split("\\s+");
        Map<Character, String> map = new HashMap<>();
        if (str.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i)) && !map.containsValue(str[i])) {
                map.put(pattern.charAt(i), str[i]);
            } else if (!map.containsKey(pattern.charAt(i))
                    || (map.containsKey(pattern.charAt(i)) && !str[i].equals(map.get(pattern.charAt(i))))) {
                return false;
            }
        }
        return true;
    }
}
