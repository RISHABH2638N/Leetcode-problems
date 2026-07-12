class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                nums[i]=2*nums[i];
                nums[i+1]=0;
            }
        }
        int[] arr=new int[nums.length];
        int a=0;
        for(int x:nums){
            if(x!=0){
                arr[a++]=x;
            }
        }
        return arr;
    }
}