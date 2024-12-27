class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int res = 0;
        int curMax = values[0] - 1;

        for (int i = 1; i < values.length; i++) {
            res = Math.max(res, values[i] + curMax);
            curMax = Math.max(curMax - 1, values[i] - 1);
        }

        return res;
    }
}
