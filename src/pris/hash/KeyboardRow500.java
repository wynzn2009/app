package pris.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyboardRow500 {
    public String[] findWords(String[] words) {
        List<String> re = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<Character, Integer>() {
            {
                put('q', 101);
                put('w', 101);
                put('e', 101);
                put('r', 101);
                put('t', 101);
                put('y', 101);
                put('u', 101);
                put('i', 101);
                put('o', 101);
                put('p', 101);
                put('a', 103);
                put('s', 103);
                put('d', 103);
                put('f', 103);
                put('g', 103);
                put('h', 103);
                put('j', 103);
                put('k', 103);
                put('l', 103);
                put('z', 107);
                put('x', 107);
                put('c', 107);
                put('v', 107);
                put('b', 107);
                put('n', 107);
                put('m', 107);
            }
        };
        for(int i=0;i<words.length;i++){
            String str = words[i].toLowerCase();
            int rec = 0;
            for(int j=0;j<str.length();j++){
                rec+= map.get(str.charAt(j));

            }
            if(rec%101==0||rec%103==0||rec%107==0){
                re.add(words[i]);
            }
        }
        String[] result = new String[re.size()];
        return re.toArray(result);
    }
}
