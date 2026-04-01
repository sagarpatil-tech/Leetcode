class Solution {
    public int findMiddleIndex(int[] nums) {
        int n= nums.length;
        int sum = 0;
        for(int i=0; i<n; i++){
             sum+= nums[i];
        }
        int Leftsum= 0;
        for(int i =0; i<n; i++){
            int Rightsum = sum - nums[i] - Leftsum;
            if(Rightsum == Leftsum){
                return i;
            }
            Leftsum+=nums[i];
        }
        return -1;
    }
}