class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums) {
            set.add(n);
        }
        int p=k;
        while(set.contains(p)){
            p+=k;
        }
        return p;
    }
}