public class Solution {
    
    public static boolean isPalindrome(String str) {
        if(str.length() == 1)
            return true;
            
        int last = str.length() - 1;
        
        for(int i=0; i<str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(last--))
                return false;
        }
        
        return true;
    }
    public int solve(String str) {
        
        int count = 0;

    
        for(int i=str.length()-1; i>=0; i--) {
            if(isPalindrome(str))
                break;
            count++;
            str = str.substring(0,i);
        }
        return count;
    }
}
