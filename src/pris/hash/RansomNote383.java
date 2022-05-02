package pris.hash;

public class RansomNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] chars = new int[26];
        for(int i=0;i<magazine.length();i++){
            chars[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            if(chars[ransomNote.charAt(i)-'a']==0){
                return false;
            }else{
                chars[ransomNote.charAt(i)-'a']--;
            }
        }
        return true;
    }
}
