class Solution {
    public int mySqrt(int num) {
        long p=num;
        while(p*p>num){
            p=(p+num/p)/2;
        }
        return (int)p;
    }
}
