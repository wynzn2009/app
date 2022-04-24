package pris.stack;

import java.util.LinkedList;

public class BackspaceStringCompare844 {
    public boolean backspaceCompare(String s, String t) {
        String ss = help(s);
        String tt = help(t);
        return ss.equals(tt);
    }

    private String help(String s) {
        LinkedList<Character> c = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if ('#' == s.charAt(i) && !c.isEmpty()) {
                c.pop();
            } else if ('#' != s.charAt(i)) {
                c.push(s.charAt(i));
            }
        }
        String ss = "";
        while (!c.isEmpty()) {
            ss = c.pop() + ss;
        }
        System.out.println(ss);
        return ss;
    }

    public boolean backspaceCompare1(String s, String t) {
        int sIndex = s.length() - 1;
        int tIndex = t.length() - 1;
        int sSum = 0;
        int tSum = 0;
        while (sIndex >= 0 || tIndex >= 0) {
            while (sIndex >= 0) {
                if (s.charAt(sIndex) == '#') {
                    sSum++;
                    sIndex --;
                } else if (sSum > 0) {
                    sSum--;
                    sIndex --;
                }else{
                    break;
                }
            }
            while (tIndex >= 0) {
                if (t.charAt(tIndex) == '#') {
                    tSum++;
                    tIndex --;
                } else if (tSum > 0) {
                    tSum--;
                    tIndex --;
                }else{
                    break;
                }
            }
            if (sIndex >= 0 && tIndex >= 0 && s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex--;
                tIndex--;
            } else if (sIndex == -1 && tIndex == -1) {
                return true;
            } else {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        BackspaceStringCompare844 b = new BackspaceStringCompare844();
        b.backspaceCompare("y#fo##f", "y#f#o##f");
    }
}
