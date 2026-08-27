class Solution {
    public int findLengthOfLCIS(int[] arr) {
        int n=arr.length;
        int count=1;
        int max=1;
        for(int i=0; i<n-1; i++){
            if(arr[i]<arr[i+1]){
                count++;
            } 
            else{
                count=1;
            }
            if(count>max){
                max=count;
            }
        }
        return max;
    }
}