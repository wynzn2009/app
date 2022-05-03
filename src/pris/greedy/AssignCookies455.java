package pris.greedy;

import java.util.Arrays;

public class AssignCookies455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gr = g.length-1;
        int sr = s.length-1;
        int re = 0;
        while(gr>=0&&sr>=0){
            if(s[sr]>=g[gr]){
                re++;
                sr--;
                gr--;
            }else{
                gr--;
            }
        }
        return re;
    }
}
