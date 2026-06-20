class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> List = new ArrayList<>();
        int n=nums.length;
        for(int i=0; i<n; i++){
            ArrayList<Integer> temp = new ArrayList<>();
             while(nums[i]>0){
             temp.add(nums[i]%10);
             nums[i]/=10;
        }
           for (int j=temp.size()-1; j>=0; j--){
             List.add(temp.get(j));
           }
        }
        int[] ans = new int[List.size()];
        for(int i=0; i<List.size(); i++){
            ans[i] = List.get(i);
        }
        return ans;
    }
}