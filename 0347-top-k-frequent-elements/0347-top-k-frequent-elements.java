class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> Q = new PriorityQueue<>((a , b) -> map.get(a) - map.get(b));
        int n= nums.length;
        for(int i=0; i<n; i++){
            map.put(nums[i] , map.getOrDefault(nums[i], 0) +1);
        }
        for(int num : map.keySet()){
            Q.offer(num);
            if(Q.size() > k){
                Q.poll();
            }
        }
        int[] result = new int[k];
        for(int i=0; i<k; i++){
                 result[i] = Q.poll();
        }
        return result;
    }
}