class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int i=0,sum=0,ans=0;
        for(int j=0; j<nums.length; j++){
            while(set.contains(nums[j])){
                set.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
            set.add(nums[j]);
            sum+=nums[j];
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}