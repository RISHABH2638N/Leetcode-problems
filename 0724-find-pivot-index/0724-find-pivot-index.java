class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=nums[i];
        }
        int rsum,lsum=0;
        for(int j=0; j<n; j++){
            rsum=sum-nums[j]-lsum;
            if(lsum==rsum){
                return j;
            }
            lsum=lsum+nums[j];
        }
        return -1;
    }
}