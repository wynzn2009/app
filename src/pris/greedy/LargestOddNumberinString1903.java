package pris.greedy;

public class LargestOddNumberinString1903 {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            if(Integer.valueOf(num.charAt(i))%2==1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        LargestOddNumberinString1903 l = new LargestOddNumberinString1903();
        l.largestOddNumber("52");
    }
}
