class Solution {
    public boolean canAliceWin(int n) {
        int sum=0;
        for(int i=10; i>=1; i--){
            sum+=i;
            if(sum>n){
                return i%2!=0;
            }
        }
        return true;
    }
}
