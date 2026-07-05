class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int n=nums.length;
        long m=1,sum=0;
        for(int i=n-1; i>=0; i--){
            if(mul>1){
                m=1L*nums[i]*mul;
                sum=sum+m;
            } 
            else 
            {
                sum=sum+nums[i];
            }
            k--;
            mul--;
            if(k==0){
                break;
            }
        }
        return sum;
    }
}