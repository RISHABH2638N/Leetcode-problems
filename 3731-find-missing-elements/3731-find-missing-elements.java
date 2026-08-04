class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> arr1=new ArrayList<>();
        Arrays.sort(nums);
        // int min=Integer.MAX_VALUE;
        int min=nums[0];
        int max=nums[nums.length-1];
        // int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0; i<n; i++){
            arr1.add(nums[i]);
            // if(nums[i]>max){
            //     max=nums[i];
            // }
            // if(nums[i]<min){
            //     min=nums[i];
            // }
        }
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int i=min; i<=max; i++){
            if(!arr1.contains(i)){
                arr2.add(i);
            }
        }
        return arr2;
    }
}
