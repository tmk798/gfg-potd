class Solution {
    public int longestSubarray(int[] arr, int k) {
        Map<Long, Integer> map = new HashMap<>();
        long prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == k) {
                maxLen = i + 1;
            }

            Integer j = map.get(prefixSum - (long)k);
            if (j != null) {
                maxLen = Math.max(maxLen, i - j);
            }

            map.putIfAbsent(prefixSum, i);
        }

        return maxLen;
    }
}
