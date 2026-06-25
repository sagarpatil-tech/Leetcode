class Solution {
    public int pivotInteger(int n) {
        int total = n*(n+1)/2;
        int sum = 0;
        for(int i=1;i<=n; i++){
                 sum +=i;
             int leftsum = total - sum +i;
             if(sum == leftsum){
                return i;
             }
        }
       return -1;
    }
}