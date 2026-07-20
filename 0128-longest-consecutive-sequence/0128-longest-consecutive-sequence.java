class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
                return 0;
            }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
            
            int best = 1 ;
            for (int value : set) {
    if (!set.contains(value - 1)) {
        int current = value;
        int count = 1;

        while (set.contains(current + 1)) {
            current++;
            count++;
        }

        best = Math.max(best, count);
    }
}
            return best;
        }
    }
