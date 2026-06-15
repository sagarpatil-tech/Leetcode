class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        ArrayList<Integer> List = new ArrayList<>();   
        for(int i = 0; i<n; i++){
             map.put(nums[i] , map.getOrDefault(nums[i] , 0) +1);
        }
        for(int i = 1 ; i<= nums.length; i++){
            if(!map.containsKey(i)){
                List.add(i);
            }
        }
        return List;
    }
}