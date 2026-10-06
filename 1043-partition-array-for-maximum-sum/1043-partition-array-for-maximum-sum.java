class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp=new int[arr.length];
        return help(arr,0,k,dp);
    }
    public int help(int[] arr,int i,int k,int[] dp){
        if(i==arr.length){
            return 0;
        }
        if(dp[i]!=0){
            return dp[i];
        }
        int max=0;
        int ans=0;
        for(int j=i; j<arr.length && j<i+k; j++){
            max=Math.max(max, arr[j]);
            int ans1=max*(j-i+1)+help(arr, j+1, k,dp);
            ans=Math.max(ans,ans1);
        }
        dp[i]=ans;
        return dp[i];
    }
}