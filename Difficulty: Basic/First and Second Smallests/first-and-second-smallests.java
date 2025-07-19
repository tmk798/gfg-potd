class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        ArrayList <Integer> sm = new ArrayList<>();
        int smallest= arr[0];
        int ssmallest = Integer.MAX_VALUE;
        for (int i = 1 ; i<arr.length; i++){
            if(arr[i]<smallest){
                ssmallest = smallest;
                smallest = arr[i];
                
            }
            else if(arr[i]!= smallest && arr[i]< ssmallest){
                ssmallest = arr[i];
            }
        }
        
        if(ssmallest == Integer.MAX_VALUE){ 
            sm.add(-1);
            
        }
        else{
            sm.add(smallest);
            sm.add(ssmallest);
            
        }
        
        return sm;
    } 
    
    
    
}
