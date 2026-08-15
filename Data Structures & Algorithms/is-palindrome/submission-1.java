class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char m=s.charAt(i);
            char n=s.charAt(j);
            while(i<j && !Character.isLetterOrDigit(m)){
                i++;
                m=s.charAt(i);
            }
            while(i<j && !Character.isLetterOrDigit(n)){
                j--;
                n=s.charAt(j);
            }
            if(Character.toLowerCase(m) != Character.toLowerCase(n)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
