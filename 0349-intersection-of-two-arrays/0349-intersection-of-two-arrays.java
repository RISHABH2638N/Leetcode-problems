class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        int m=arr1.length;
        int n=arr2.length;
        List<Integer> list=new ArrayList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++) {
                if(arr1[i]==arr2[j]){
                    if(!list.contains(arr1[i])){
                        list.add(arr1[i]);
                    }
                    break;
                }
            }
        }
        int p=list.size();
        int[] arr=new int[p];
        for(int i=0; i<p; i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}