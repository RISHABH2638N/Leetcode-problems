class Solution {
    public boolean rotateString(String s, String goal) {
        int a=s.length(),b=goal.length();
        if(a!=b){
            return false;
        }
        // boolean h=(s+s).contains(goal);
        // return h;
        String h=s+s;
        if(h.contains(goal)){
            return true;
        }
        return false;
    }
}
