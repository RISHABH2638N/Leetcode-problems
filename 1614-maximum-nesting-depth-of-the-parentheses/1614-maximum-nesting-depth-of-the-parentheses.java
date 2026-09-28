class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int count1=0;
        int count2=0;
        Stack<String> st=new Stack<>();
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='('){
                st.push("(");
                count1++;
                count2=Math.max(count2,count1);
            }
            else if(s.charAt(i)==')'){
                count1--;
            }
        }
        return count2;
    }
}