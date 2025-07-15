class Solution {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i) count++;
            }
        }
        if (count == 2){
            return true;
        }
        else {
            return false;
        }
    }
}
