class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int p=nums[n-1]-nums[0];
        for(int i=0; i<=2; i++){
            int high=nums[n-1-(2-i)]-nums[i];
            int low=0;
            p=Math.min(p, high+low);
        }
        return p;
    }
}