class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n=happiness.length;
        Arrays.sort(happiness);
        long sum=0;
        int j=n-1;
        int i=0;
        while(k!=0 && j>=0){
            int d=happiness[j]-i;
            if(d<0){
                break;
            }
            sum+=d;
            j--;
            i++;
            k--;
        }
        return sum;
    }
}