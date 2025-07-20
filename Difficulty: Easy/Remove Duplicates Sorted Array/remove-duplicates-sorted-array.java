class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList <Integer> result = new ArrayList<>();
        if (arr.length == 0) return result;
        result.add(arr[0]);
        for (int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]) {
                result.add(arr[i]);
            }
        }
        return result;
    }
}
