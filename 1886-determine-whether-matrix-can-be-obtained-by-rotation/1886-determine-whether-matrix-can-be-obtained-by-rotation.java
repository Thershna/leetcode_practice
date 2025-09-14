import java.util.Arrays;

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;


        for (int r = 0; r < 4; r++) {
            int[][] result = new int[n][n];

            // Rotate 90° clockwise
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    result[j][n - 1 - i] = mat[i][j];
                }
            }

            
            if (Arrays.deepEquals(result, target)) {
                return true;
            }

           
            mat = result;
        }

        return false; // none matched
    }
}
