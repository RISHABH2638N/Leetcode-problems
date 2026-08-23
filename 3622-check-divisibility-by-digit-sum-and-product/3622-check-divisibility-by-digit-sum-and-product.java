class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,product=1,q=n;
        while(n!=0){
            int rem=n%10;
            sum=sum+rem;
            product=product*rem;
            n=n/10;
        }
        int p=sum+product;
        if(q%p==0){
            return true;
        }
        return false;
    }
}