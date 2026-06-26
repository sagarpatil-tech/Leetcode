class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int small = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int m = nums[i];
            small = Math.min(small , m);
        }
        int ans = 0;
        for(int i=0; i<n; i++){
             ans += nums[i] - small;
        }
        return ans;
    }
}