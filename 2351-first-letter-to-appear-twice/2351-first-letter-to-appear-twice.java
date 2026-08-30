class Solution {
    public char repeatedCharacter(String s) {
        int n=s.length();
        int i=0;
        char[] arr=s.toCharArray();
        while(i<n){
            int j=0;
            while(j<i){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
                j++;
            }
            i++;
        }
        return ' ';
    }
}