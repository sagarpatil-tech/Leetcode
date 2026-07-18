class Solution {
    public int findGCD(int[] nums) {
        int n =nums.length;
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
           a = Math.max(a, nums[i]);
           b = Math.min(b , nums[i]);
        }
        while(a != 0){
            int rem = b % a;
            b = a;
            a = rem;
        }
        return b;
    }
}