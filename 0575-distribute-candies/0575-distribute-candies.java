class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer, Integer> map= new HashMap<>();
        int n = candyType.length;
        for(int i=0; i<n; i++){
            map.put(candyType[i] , map.getOrDefault(candyType[i], 0) +1);
            }
              return Math.min(map.size(), n/2);
        }
      
    }
