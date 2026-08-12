class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0;
        int sum=0; 
        int n=nums.length;
        int len1=0,len2=0;
        for(int num:nums){
            if(num==target){
                return 1;
            }
        }
        while(j<n){
            sum+=nums[j];
            while(sum>=target){
                len1=j-i+1;
                if(len2==0){
                    len2=len1;
                }
                else{
                len2=Math.min(len1,len2);
                }
                sum-=nums[i];
                i++;
            }
            if(sum<target){
            j++;
            }
        }
        return len2;
    }
}