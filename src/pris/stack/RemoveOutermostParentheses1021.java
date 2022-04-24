package pris.stack;

public class RemoveOutermostParentheses1021 {
    public String removeOuterParentheses(String s) {
        int index = 0;
        int sum = 0;
        String re = "";
        for(int i = 0;i<s.length();i++){
            
            char c = s.charAt(i);
            if(c=='('){
                sum++;
            }else{
                sum--;
            }
            if(sum==0){
                re += s.substring(index+1, i);
                index = i + 1;
            }

        }
        return re;
    }
}
