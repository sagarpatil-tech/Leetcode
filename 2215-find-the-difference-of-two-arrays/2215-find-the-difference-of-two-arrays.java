class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int i= 0; i<nums1.length; i++){
            map1.put(nums1[i] , map1.getOrDefault(nums1[i], 0) +1);
        }
        for(int i=0; i<nums2.length; i++){
            map2.put(nums2[i], map2.getOrDefault(nums2[i], 0) +1);
        }
List<List<Integer>> List = new ArrayList<>(); 
     ArrayList<Integer> L1 = new ArrayList<>();
      ArrayList<Integer> L2 = new ArrayList<>();     
        for (int key : map1.keySet()) {
            if (!map2.containsKey(key)) {
                L1.add(key);
            }
        }

        // Elements present in nums2 but not in nums1
        for (int key : map2.keySet()) {
            if (!map1.containsKey(key)) {
                L2.add(key);
            }
        }
        List.add(L1);
        List.add(L2);
        return List;
    }
}