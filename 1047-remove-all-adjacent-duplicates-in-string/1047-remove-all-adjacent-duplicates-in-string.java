class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder(s);
        int i=0;
        if(sb.length()==0){
            return sb.toString();
        }
        while(i<sb.length()-1){
            if(sb.charAt(i+1)==sb.charAt(i)){
                sb.deleteCharAt(i+1);
                sb.deleteCharAt(i);
                if(i>0){
                    i--;
                }
            }
            else{
               i++;
            }
        }
        return sb.toString();
    }
}