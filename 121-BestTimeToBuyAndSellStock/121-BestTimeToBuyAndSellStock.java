// Last updated: 2/13/2026, 9:46:50 AM
class Solution {
    public int maxProfit(int[] arr) {
        int max = 0;
        int buy = arr[0];
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (buy > arr[i]) {
                buy = arr[i];
            } else {
                int p = arr[i] - buy;
                if (max < p) {
                    max = p;
                }
            }
        }
        return max;
    }
}
