class Solution {
    public static int largest(int[] arr) {
        // code here
    
        int largest = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>largest) largest = arr[i];
        }
        return largest;
    }
}
