package pris.greedy;

public class DIStringMatch942 {
    public int[] diStringMatch(String s) {
        int[] re = new int[s.length() + 1];
        int min = 0;
        int max = s.length();
        for (int i = 0; i < s.length(); i++) {
            if ('I' == s.charAt(i)) {
                re[i] = min;
                min++;
            } else {
                re[i] = max;
                max--;
            }
        }
        re[s.length()] = min;
        return re;
    }
}
