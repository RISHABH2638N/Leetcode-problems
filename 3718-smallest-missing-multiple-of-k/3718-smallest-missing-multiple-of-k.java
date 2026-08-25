class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int p=k;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==p){
                p += k;
            }
        }
        return p;
    }
}