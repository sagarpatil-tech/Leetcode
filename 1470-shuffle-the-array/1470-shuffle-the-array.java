class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] result = new int[nums.length];
        int i =0; 
        int j =0;
        int k =n;
     while(i < n){
         result[j] = nums[i];
         j++;
         i++;
         result[j] = nums[k];
         j++;
         k++;
     }   
      return result;  
        
    }
}