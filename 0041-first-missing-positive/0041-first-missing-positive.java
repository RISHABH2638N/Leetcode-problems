class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int p=1;
        for(int n:nums){
            if(n==p){
                p++;
            }
        }
        return p;
    }
}