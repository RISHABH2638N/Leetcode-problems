class Solution {
    public int myAtoi(String s) {
        int n=s.length();
        int i=0;
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        int sign=1;
        if(i<n && s.charAt(i)=='-'){
            sign=-1;
            i++;
        } 
        else if(i<n && s.charAt(i)=='+'){
            i++;
        }
        long p=0;
        while(i<n && Character.isDigit(s.charAt(i))){
            p=p*10+(s.charAt(i)-'0');
        if(sign==1 && p>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        else if(sign==-1 && -p<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
            i++;
        }
        return (int)(p*sign);
    }
}