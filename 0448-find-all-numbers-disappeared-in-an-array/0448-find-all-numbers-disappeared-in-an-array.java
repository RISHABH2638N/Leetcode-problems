class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        ArrayList<Integer> a=new ArrayList<>();
        int p=1;
        for(int i=0; i<n; i++){
            while(p<arr[i]){
                a.add(p);
                p++;
            }
            if(p==arr[i]){
                p++;
            }
        }
        while(p<=n){
            a.add(p);
            p++;
        }
        return a;
    }
}