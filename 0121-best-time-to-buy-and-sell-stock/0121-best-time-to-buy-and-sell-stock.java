class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit1=0,profit2;
        int a=prices[0]; //a is minimum price 
        for(int i=1; i<n; i++){
            if(prices[i]<a){
                a=prices[i];
            }
            profit2=prices[i]-a;
            profit1=Math.max(profit1, profit2);
        }
        return profit1;
    }
}