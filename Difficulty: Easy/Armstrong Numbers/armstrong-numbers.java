// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int duplicate = n ;
        int sum = 0;
        while (n > 0)
        {
            int lastnum = n % 10;
            sum = sum + (lastnum*lastnum*lastnum ) ;
// because armstrong means given numbers individual digits cube sum must be equialto given number
n = n/10;

        }
        
        if (sum == duplicate) return true;
        else return false;
    }
    
}