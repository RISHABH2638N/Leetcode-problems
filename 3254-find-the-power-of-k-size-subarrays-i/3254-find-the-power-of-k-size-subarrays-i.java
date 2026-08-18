class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int[] arr=new int[n-k+1];
        int m=arr.length;
        for(int i=0; i<m; i++){
            int p=i+k-1;
            arr[i]=nums[p];
            for(int j=i; j<p; j++){
                if(nums[j+1]-nums[j]!=1){
                    arr[i]=-1;
                    break;
                }
            }
        }
        return arr;
    }
}