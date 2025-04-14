//{ Driver Code Starts
// Initial Template for Java
import java.util.*;


// } Driver Code Ends

class Solution {
    private void topo(List<List<Integer>> adj, List<Integer> list, boolean[] exists) {
        int v = adj.size();
        int inorder[] = new int[v];
        
        for(int i=0; i<v; i++) {
            for(int it: adj.get(i)) {
                inorder[it]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i<v; i++) {
            if(exists[i] && inorder[i] == 0) {
                q.add(i);
            }
        }
        
        int cnt = 0;
        while(!q.isEmpty()) {
            int node = q.remove();
            list.add(node);
            cnt++;
            
            for(int it: adj.get(node)) {
                inorder[it]--;
                
                if(inorder[it] == 0) {
                    q.add(it);
                }
            }
        }
        
        int totalExists = 0;
        for(boolean b: exists) {
            if(b) totalExists++;
        }
        
        if(cnt != totalExists) {
            list.clear();
        }
    }
    
    public String findOrder(String[] words) {
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < 26; i++) {
            adj.add(new ArrayList<>());
        }
        
        boolean[] exists = new boolean[26];
        for(String word : words) {
            for(char ch : word.toCharArray()) {
            exists[ch - 'a'] = true;
            }
            
        }
        
        for(int i=0; i<words.length-1; i++) {
            String s1 = words[i];
            String s2 = words[i+1];
            int len = Math.min(s1.length(), s2.length());
            
            if (s1.length() > s2.length() && s1.startsWith(s2)) {
                return "";
            }

            
            for(int j=0; j<len; j++) {
                if(s1.charAt(j) != s2.charAt(j)) {
                    adj.get(s1.charAt(j) - 'a').add(s2.charAt(j) - 'a');
                    break;
                }
            }
        }
        
        List<Integer> topoSort = new ArrayList<>();
        topo(adj, topoSort, exists);
        
        if (topoSort.isEmpty()) return "";
        
        String res = "";
        for(int it: topoSort) {
            if(exists[it]) {
             res+= (char)(it + (int)('a'));   
            }
        }
        return res;
    }
}

//{ Driver Code Starts.

public class GFG {
    private static boolean validate(String[] original, String order) {
        Map<Character, Integer> mp = new HashMap<>();
        for (String word : original) {
            for (char ch : word.toCharArray()) {
                mp.put(ch, 1);
            }
        }
        for (char ch : order.toCharArray()) {
            if (!mp.containsKey(ch)) {
                return false;
            }
            mp.remove(ch);
        }
        if (!mp.isEmpty()) {
            return false;
        }

        Map<Character, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            indexMap.put(order.charAt(i), i);
        }

        for (int i = 0; i < original.length - 1; i++) {
            String a = original[i];
            String b = original[i + 1];
            int k = 0, n = a.length(), m = b.length();

            while (k < n && k < m && a.charAt(k) == b.charAt(k)) {
                k++;
            }

            if (k < n && k < m &&
                indexMap.get(a.charAt(k)) > indexMap.get(b.charAt(k))) {
                return false;
            }
            if (k != n && k == m) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()); // Number of test cases

        while (t-- > 0) {
            String[] words = sc.nextLine().split(" ");
            String[] original = Arrays.copyOf(words, words.length);

            Solution ob = new Solution();
            String order = ob.findOrder(words);

            if (order.isEmpty()) {
                System.out.println("\"\"");
            } else {
                System.out.println(validate(original, order) ? "true" : "false");
            }
            System.out.println("~");
        }

        sc.close();
    }
}

// } Driver Code Ends