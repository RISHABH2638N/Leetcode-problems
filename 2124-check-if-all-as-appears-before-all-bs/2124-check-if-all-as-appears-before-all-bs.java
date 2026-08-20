class Solution {
    public boolean checkString(String s) {
        int i=1;
        int n=s.length();
        while(i<n){
            if(s.charAt(i-1)=='b' && s.charAt(i)=='a'){
                return false;
            }
            i++;
        }
        return true;
    }
}