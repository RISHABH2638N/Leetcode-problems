class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int d=numBottles;
        while(numBottles>=numExchange){
            int t=0;
            t+=(numBottles%numExchange);
            d+=numBottles/numExchange;
            numBottles=numBottles/numExchange;
            numBottles+=t;
        }
        return d;
    }
}