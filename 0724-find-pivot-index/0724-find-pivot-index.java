class Solution {
    public int pivotIndex(int[] nums) {
        
        int n = nums.length;
        int sum = 0;
        for(int i=0; i<n; i++ ){
            sum = sum + nums[i];
        }
        int Left = 0;
        for(int i= 0; i<n; i++){
            int right= sum - Left - nums[i];
            if(Left == right){
                return i;
            }
             Left+= nums[i];
            
      }
    return -1;
    
        }
}