class Solution {
    public int majorityElement(int[] nums) {
        // int c=0;
        // int count=0;
        // for(int n:arr){
        //     if(count==0){
        //         c=n;
        //     }
        //     if(n==c){
        //         count++;
        //     } 
        //     else{
        //         count--;
        //     }
        // }
        // return c;
        int i=0; 
        int n=nums.length;
        Arrays.sort(nums);
        for(int j=0; j<n; j++){
            int count=0;
            while(nums[i]==nums[j]){
                count++;
                if(count>n/2){
                return nums[i];
            }
            i++;
            }
        }
        return 0;
    }
}