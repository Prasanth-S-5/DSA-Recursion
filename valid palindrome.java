class Solution {

    public static boolean palindrome(int i, String s, int j){
       int n = s.length();
       if(i>=j){
         return true;
       }

        char c = s.charAt(i);
        char d = s.charAt(j);

       if(c<'a' && c<'0' || c<'a' && c>'9' || c>'z'){
         return palindrome(i+1, s, j);
       }
       else if(d<'a' && d<'0' || d<'a' && d>'9' || d>'z'){
         return palindrome(i, s, j-1);
       }
       else if(s.charAt(i)!=s.charAt(j)){
         return false;
       }

       return palindrome(i+1, s, j-1);
    }

    public boolean isPalindrome(String s) {
        return palindrome(0, s.toLowerCase(), s.length()-1);
    }
}
