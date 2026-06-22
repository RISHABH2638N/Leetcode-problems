class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n-1 && nums[i]==nums[i+1]){
            i++;
        }
        if(i==n-1){
            return true;
        }
        boolean d=nums[i]>nums[i+1];
        for (i=0; i<n-1; i++){
            if(d){
                if(nums[i+1]>nums[i]){
                    return false;
                }
            } 
            else{
                if(nums[i+1]<nums[i]){
                    return false;
                }
            }
        }
        return true;
    }
}