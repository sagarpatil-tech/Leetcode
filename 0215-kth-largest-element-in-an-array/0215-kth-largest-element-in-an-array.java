class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q1 = new PriorityQueue<>();
        for(int i=0; i<k; i++){
            q1.add(nums[i]);
    }
    for(int i=k; i<nums.length; i++){
        if(q1.peek() < nums[i]){
            q1.poll();
            q1.add(nums[i]);
        }

    }
    return q1.peek();
}
}