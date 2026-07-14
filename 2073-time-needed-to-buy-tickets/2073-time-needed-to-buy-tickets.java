class Solution {
    public int timeRequiredToBuy(int[] arr, int k) {
        int n=arr.length;
        int ans=arr[k];
        for(int i=0; i<k; i++){
            ans=ans+Math.min(arr[i], arr[k]);
        }
        for(int i=k+1; i<n; i++){
            ans=ans+Math.min(arr[i], arr[k]-1);
        }
        return ans;
    }
}