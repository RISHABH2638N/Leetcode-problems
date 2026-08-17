class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int t=0;
        int F=0;
        n=requests.length;
        for(int i=0; i<n; i++){
            t=t+Math.abs(requests[i]-F);
            F=requests[i];
        }
        return t;
    }
}