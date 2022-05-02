package pris.hash;

public class LongestPalindrome409 {
    public int longestPalindrome(String s) {
        int[] chars = new int[60];
        for(int i=0;i<s.length();i++){
            chars[s.charAt(i)-'A']++;
        }
        int re = 0;
        for(int i=0;i<60;i++){
            re += (chars[i]/2)*2;
        }
        if(re<s.length()){
            re ++;
        }
        return re;
    }
}
