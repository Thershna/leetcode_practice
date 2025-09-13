
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> ans = new ArrayList<>();
        
        // Find the maximum in candies
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }
        
        // Check each kid
        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= maxCandies) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        
        return ans;
    }
}
