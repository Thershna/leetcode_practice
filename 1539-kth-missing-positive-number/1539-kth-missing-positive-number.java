class Solution {
    public int findKthPositive(int[] arr, int k) {

        int start = 1;
        int i = 0;

        while (k > 0) {

            if (i < arr.length && arr[i] == start) {
                i++;
            } else {
                k--;
                if (k == 0) {
                    return start;
                }
            }

            start++;
        }

        return start;
    }
}