package pris.greedy;

public class MinimumMovestoConvertString2027 {
    public int minimumMoves(String s) {
        int i = 0;
        int re = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'X') {
                re++;
                i += 3;
            } else {
                i++;
            }

        }
        return re;
    }
}
