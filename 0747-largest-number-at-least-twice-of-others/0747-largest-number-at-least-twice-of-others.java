class Solution {
    public int dominantIndex(int[] nums) {
        int[] arr=nums.clone();
        Arrays.sort(arr);
        int n=nums.length;
        int p=arr[n-1];
        for(int i=0; i<n-1; i++){
            if(p<2*arr[i]){
                return -1;
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i]==p){
                return i;
            }
        }
        return -1;
    }
}