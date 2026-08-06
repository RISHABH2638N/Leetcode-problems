class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n; i<=10*n; i++){
            int p=1;
            int a=i;
            while(a!=0){
                int rem=a%10;
                p=p*rem;
                a=a/10;
            }
            if(p%t==0){
                return i;
            }
        }
        return -1;
    }
}