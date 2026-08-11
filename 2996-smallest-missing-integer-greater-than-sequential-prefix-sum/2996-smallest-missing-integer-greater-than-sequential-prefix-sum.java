class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        int sum=nums[0];
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i:nums){
            arr.add(i);
        }
        for(int j=1; j<n; j++){
            if(nums[j]==nums[j-1]+1){
                sum+=nums[j];
            }
            else{
                break;
            }
        }
        while(arr.contains(sum)){
            sum++;
        }
        return sum;
    }
}