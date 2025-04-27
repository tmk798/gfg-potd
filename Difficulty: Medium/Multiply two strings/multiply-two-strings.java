//{ Driver Code Starts
// Initial Template for Java

import java.math.*;
import java.util.*;

class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            Solution g = new Solution();
            System.out.println(g.multiplyStrings(a, b));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String multiplyStrings(String s1, String s2) {
        // Convert strings to BigInteger
        BigInteger num1 = new BigInteger(s1);
        BigInteger num2 = new BigInteger(s2);
        
        // Multiply the numbers
        BigInteger result = num1.multiply(num2);
        
        // Convert result back to string
        return result.toString();
    }
}

