class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i=0; i<operations.length; i++){
            int n=arr.size();
            if(operations[i].equals("C")){
                arr.remove(n-1);
            }
            else if(operations[i].equals("D")){
                int q=arr.get(n-1);
                arr.add(q*2);
            }
            else if(operations[i].equals("+")){
                int r=arr.get(n-1)+arr.get(n-2);
                arr.add(r);
            }
            else{
                arr.add(Integer.parseInt(operations[i]));
            }
        }
        int sum=0;
        for (int i=0; i<arr.size(); i++){
            sum+=arr.get(i);
        }
        return sum;
    }
}