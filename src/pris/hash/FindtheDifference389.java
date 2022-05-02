package pris.hash;

public class FindtheDifference389 {
    public char findTheDifference(String s, String t) {
        int sum = 0;
        for(int i=0;i<t.length();i++){
            sum += t.charAt(i)-'a';
        }
        for(int i=0;i<s.length();i++){
            sum -= s.charAt(i)-'a';
        }
        return (char) ('a' + sum);
    }
}
