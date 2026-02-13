// Last updated: 2/13/2026, 9:46:31 AM
class Solution {
    public boolean reorderedPowerOf2(int n) {
        java.util.function.Function<Integer, String> countDigits = x -> {
            char[] arr = String.valueOf(x).toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        };
        String target = countDigits.apply(n);
        for (int i = 0; i < 31; i++) {
            if (countDigits.apply(1 << i).equals(target)) return true;
        }
        return false;
    }
}