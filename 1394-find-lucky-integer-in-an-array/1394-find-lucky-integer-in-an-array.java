class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i] , map.getOrDefault(arr[i], 0) +1);

        }
        int ans = -1;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int num = entry.getKey();
            int frq = entry.getValue();
            if(num == frq){
                ans = Math.max(ans , num);
            }
        }
        return ans;
    }
}