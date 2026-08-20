class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int i=2;
        while(i<nums.length){
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)){
            arr1.add(nums[i]);
            }
            else{
            arr2.add(nums[i]);
            }
            i++; 
        }
        arr1.addAll(arr2);
        int[] result=new int[arr1.size()];
        for(int j=0; j<arr1.size(); j++){
          result[j]=arr1.get(j);
        }
       return result;
    }
}