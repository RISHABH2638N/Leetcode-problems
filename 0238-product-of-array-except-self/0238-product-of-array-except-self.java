class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] pro=new int[n];
        int p=1,count=0;
        for(int x:nums){
            if(x!=0){
                p=p*x;
            } 
            else{
                count++;
            }
        }
        for(int i=0; i<n; i++){
            if(count>1){
                pro[i]=0;
            } 
            else if(count==1){
                if(nums[i]==0){
                    pro[i]=p;
                }
                else
                {
                    pro[i]=0;
                }
            } 
            else{
                pro[i]=p/nums[i];
            }
        }
        return pro;
    }
}