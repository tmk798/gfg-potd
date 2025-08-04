class Solution {
    int missingNum(int arr[]) {
        int n = arr.length + 1;
        long sum = (long) n * (n + 1) / 2;
        long sumi = 0;
        for (int i = 0; i < arr.length; i++) {
            sumi += arr[i];
        }
        return (int)(sum - sumi);
    }
}
