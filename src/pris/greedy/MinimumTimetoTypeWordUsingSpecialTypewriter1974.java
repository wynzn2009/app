package pris.greedy;

public class MinimumTimetoTypeWordUsingSpecialTypewriter1974 {
    public int minTimeToType(String word) {
        int re = word.length();
        for (int i = 0; i < word.length(); i++) {
            if (i == 0) {
                re += Math.min(word.charAt(i) - 'a', 26 - word.charAt(i) + 'a');
            } else {
                re += Math.min(Math.abs(word.charAt(i) - word.charAt(i - 1)),
                        26 - Math.abs(word.charAt(i) - word.charAt(i - 1)));
            }
        }
        return re;
    }
}
