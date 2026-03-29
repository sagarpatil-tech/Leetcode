class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        
        int noDeletion = arr[0];      // max sum without deletion
        int oneDeletion = 0;          // max sum with one deletion
        int ans = arr[0];
        
        for (int i = 1; i < n; i++) {
            oneDeletion = Math.max(noDeletion, oneDeletion + arr[i]);
            noDeletion = Math.max(arr[i], noDeletion + arr[i]);
            
            ans = Math.max(ans, Math.max(noDeletion, oneDeletion));
        }
        
        return ans;
    }
}