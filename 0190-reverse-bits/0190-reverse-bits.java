class Solution {
    public int reverseBits(int n) {

        int result = 0;

        for (int i = 0; i < 32; i++) {

            // Shift result left to make space for next bit
            result <<= 1;

            // Take last bit of n and add it to result
            result |= (n & 1);

            // Remove the last bit from n
            n >>>= 1;
        }

        return result;
    }
}