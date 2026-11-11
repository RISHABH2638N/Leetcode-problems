class Solution {
    public int[] constructRectangle(int area) {
        int[] arr=new int[2];
        for(int l=1; l<=area; l++){
            if(area%l==0){
                int b=area/l;
                if(l>=b){
                    arr[0]=l;
                    arr[1]=b;
                    break;
                }
            }
        }
        return arr;
    }
}