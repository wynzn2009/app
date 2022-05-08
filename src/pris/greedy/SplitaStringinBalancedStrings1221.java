package pris.greedy;

public class SplitaStringinBalancedStrings1221 {
    public int balancedStringSplit(String s) {
        int re = 0;
        char[] c = s.toCharArray();
        int sum = 0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='L'){
                sum++;
            }else{
                sum--;
            }
            if(sum==0){
                re++;
            }
        }
        return re;
    }
}
