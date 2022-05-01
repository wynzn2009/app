package pris.stack;

public class MaximumNestingDepthoftheParentheses1614 {
    public int maxDepth(String s) {
        char[] chars = s.toCharArray();
        int re = 0;
        int tmp = 0;
        for(char c :chars){
            if(c=='('){
                tmp++;
                re = Math.max(tmp, re);
            }else if(c==')'){
                tmp--;
            }
        }
        return re;
    }
}
