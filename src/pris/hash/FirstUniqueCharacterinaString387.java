package pris.hash;

import java.util.Arrays;

public class FirstUniqueCharacterinaString387 {
    public int firstUniqChar(String s) {
        int[] chars = new int[26];
        Arrays.fill(chars, -1);
        for(int i=0;i<s.length();i++){
            if(chars[s.charAt(i)-'a']==-1){
                chars[s.charAt(i)-'a'] = i;
            }else if(chars[s.charAt(i)-'a']!=-1){
                chars[s.charAt(i)-'a'] = -2;
            }
        }
        int re = Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(chars[i]>=0){
                re = Math.min(re, chars[i]);
            }
        }
        return re==Integer.MAX_VALUE?-1:re;
    }
    public static void main(String[] args) {
        FirstUniqueCharacterinaString387 f = new FirstUniqueCharacterinaString387();
        String s = "leetcode";
        f.firstUniqChar(s);
    }
}
