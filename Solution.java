class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n = matrix.length;
        long totalSum = 0; // To hold the sum of absolute values
        int negativeCount = 0; // To count negative numbers
        int minAbsValue = Integer.MAX_VALUE; // To track the smallest absolute value

        // Iterate over the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = matrix[i][j];
                totalSum += Math.abs(val); // Add absolute value to total sum
                if (val < 0) {
                    negativeCount++; // Count negatives
                }
                minAbsValue = Math.min(minAbsValue, Math.abs(val)); // Track smallest absolute value
            }
        }

        // If odd negatives, subtract twice the smallest absolute value
        if (negativeCount % 2 != 0) {
            totalSum -= 2 * minAbsValue;
        }

        return totalSum;
    }
}
