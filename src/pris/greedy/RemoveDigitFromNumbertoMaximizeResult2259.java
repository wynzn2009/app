package pris.greedy;

public class RemoveDigitFromNumbertoMaximizeResult2259 {
    public String removeDigit(String number, char digit) {
        char[] chars = number.toCharArray();
        int ind = -1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == digit) {
                if (i == chars.length - 1) {
                    return number.substring(0, i);
                }
                if (chars[i] < chars[i + 1]) {
                    return number.substring(0, i) + number.substring(i + 1, chars.length);
                }
                ind = i;
            }

        }

        return number.substring(0, ind) + number.substring(ind + 1, chars.length);
    }
}
