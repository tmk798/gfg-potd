//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();

            Solution ob = new Solution();
            int result = ob.countSubstring(s);

            System.out.println(result);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends

class Solution {
    public int countSubstring(String str) {
        // code here
        
        int count = 0;
        Map<Character , Integer> hm = new HashMap<>();
        
        for(int i = 0 ; i < str.length() ; i++) {
          
          if(hm.containsKey(str.charAt(i))){
              count += hm.get(str.charAt(i));
          }
          
          hm.put(str.charAt(i) , hm.getOrDefault(str.charAt(i) , 0) + 1);
        }
        
        Collection<Integer> ans = hm.values();
        for(Integer val : ans) {
            count += val;
        }
        
        return count;
    }
}