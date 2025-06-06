/*
https://leetcode.com/problems/valid-anagram/
*/

class Solution {

   public static boolean anag(int i, String s, String t, int[] hash){
      
       int n = s.length();
       if(i>=n){
        for(int j=0;j<26;j++){
            if(hash[j]!=0){
                return false;
            }
        } 
        return true;
       }

       hash[s.charAt(i) - 'a']++;
       hash[t.charAt(i) - 'a']--;
      

      return anag(i+1, s, t, hash);
   }

    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()) return false;
        return anag(0,s,t,new int[26]);
    }
}
