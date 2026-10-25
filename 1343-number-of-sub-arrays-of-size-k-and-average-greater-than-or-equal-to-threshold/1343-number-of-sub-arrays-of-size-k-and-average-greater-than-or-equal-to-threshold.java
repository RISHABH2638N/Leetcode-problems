class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans=0;
        int i=0,j=0,sum=0;
        int n=arr.length;
        while(j<n){
            sum+=arr[j];
            if(j-i+1==k){
                int avg=sum/k;
                if(avg>=threshold){
                    ans++;
                }    
                sum-=arr[i];
                i++;
            }
            j++;
        }
        return ans;
    }
}