class Solution {

    public int countDistinctIntegers(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
            set.add(reverse(num));
        }

        return set.size();
    }

    public int reverse(int num) {

        int ans = 0;

        while (num > 0) {
            int digit = num % 10;
            ans = ans * 10 + digit;
            num = num / 10;
        }

        return ans;
    }
}