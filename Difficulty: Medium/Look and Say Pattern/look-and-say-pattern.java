//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());

            Solution ob = new Solution();

            System.out.println(ob.countAndSay(n));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public String countAndSay(int n) {
        // code here
        StringBuilder ans=new StringBuilder("1");
        for(int i=2;i<=n;i++) ans=f(ans);
        return ans.toString();
    }
    
    StringBuilder f(StringBuilder s){
        StringBuilder ans=new StringBuilder();
        int i=0;
        while(i<s.length()){
            char c=s.charAt(i);
            int count=0;
            while(i<s.length() && s.charAt(i)==c) {count++;i++;}
            ans.append(count+""+c);
        }
        return ans;
    }

        
    }
