class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        
        for (int i=1;i<arr.length;i++){
           if(arr[i]>=arr[i-1]){
               
           } 
           else return false;
        }
        
        return true;
        
        
    }
}