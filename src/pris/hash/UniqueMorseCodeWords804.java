package pris.hash;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords804 {
    String[] mos = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
            "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
    };
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for(int i=0;i<words.length;i++){
            set.add(help(words[i]));
        }
        return set.size();
    }

    private String help(String str){
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            sb.append(mos[c-'a']);
        }
        return sb.toString();
    }
}
