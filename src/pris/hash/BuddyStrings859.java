package pris.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BuddyStrings859 {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        Character c = null;
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
            if (s.charAt(i) != goal.charAt(i)) {
                if (map.containsKey(s.charAt(i))) {
                    return false;
                } else {
                    map.put(s.charAt(i), goal.charAt(i));
                    c = s.charAt(i);
                }
            }
        }
        if (map.isEmpty() && set.size() < s.length()) {
            return true;
        }
        if (map.keySet().size() != 2) {
            return false;
        }
        return c == map.get(map.get(c));
    }
}
