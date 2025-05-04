//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String str = br.readLine();

            Solution obj = new Solution();
            System.out.println(obj.findSubString(str));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findSubString(String str) {
        int n=str.length();
        int minSize=Integer.MAX_VALUE;
        
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        int requiredSize=set.size();
        
        Map<Character,Integer>  map=new HashMap<>();
        int i=0;
        
        for(int j=0;j<n;j++){
            char chr=str.charAt(j);
            map.put(chr,map.getOrDefault(chr,0)+1);
            
            while(map.size()==requiredSize){
                minSize=Math.min(minSize,j-i+1);
                
                char ch=str.charAt(i);
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0)
                    map.remove(ch);
                    
                i++;
            }
            
        }
        
        return minSize;
    }
}