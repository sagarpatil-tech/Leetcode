class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
            int current =0;
            int high =0;
        for(int i=0; i<n; i++){
            int max = gain[i] + current ; 
            high = Math.max(max , high);
            current = max;
        }
        return high;
    }
}