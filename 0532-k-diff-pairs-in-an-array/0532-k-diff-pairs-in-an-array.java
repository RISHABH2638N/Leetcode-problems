class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0){
            return 0;
        }
        Arrays.sort(nums);
        int count=0;
        for(int i=0; i<nums.length-1; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1; j<nums.length; j++){
                int d=nums[j]-nums[i];
                if(d==k){
                    count++;
                    break;
                }
                if(d>k){
                    break;
                }
            }
        }
        return count;
    }
}