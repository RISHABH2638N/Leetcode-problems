class Solution {
    public int[] constructRectangle(int area) {
        int[] arr=new int[2];
        for (int L=1; L<=area; L++){
            if(area%L==0){
                int B=area/L;
                if(L>=B){
                    arr[0]=L;
                    arr[1]=B;
                    break;
                }
            }
        }
        return arr;
    }
}