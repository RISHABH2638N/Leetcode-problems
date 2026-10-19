
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> arr=new ArrayList<>();
        int i=num.length-1;
        while(i>=0 || k>0){
            if(i>=0){
                k+=num[i];
            }
            int p=k%10;
            arr.add(p);
            k=k/10;
            i--;
        }
        Collections.reverse(arr);
        return arr;
    }
}