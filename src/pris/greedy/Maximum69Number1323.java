package pris.greedy;

public class Maximum69Number1323 {
    public int maximum69Number(int num) {
        String re = String.valueOf(num);
        int count = -1;
        for (int i = 0; i < re.length(); i++) {
            if (re.charAt(i) == '6') {
                count = re.length() - i - 1;
                break;
            }
        }
        return count == -1 ? num : (int) (num + 3 * Math.pow(10, count));
    }
}
