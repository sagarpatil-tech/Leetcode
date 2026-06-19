class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> List = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                List.add(i);
            }
        }
        return List;
    }
}