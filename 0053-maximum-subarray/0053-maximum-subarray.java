class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        // To track the subarray
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (currentSum + nums[i] < nums[i]) {
                currentSum = nums[i];
                tempStart = i; // start a new subarray
            } else {
                currentSum += nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart; // update start of max subarray
                end = i;           // update end of max subarray
            }
        }
        return maxSum;
        
    }
}