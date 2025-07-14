class Solution {
    public static void print_divisors(int n) {
        // code here
        ArrayList<Integer> divisors = new ArrayList<>();
        int sqrt = (int)Math.sqrt(n);
        for (int i = 1  ; i<= sqrt ; i++){
            if(n % i == 0){
                   divisors.add(i);  
                     if( n/i !=i){
                          divisors.add(n/i);
                     }
            }
          
        }
        Collections.sort(divisors);
        for ( int d : divisors){
System.out.print(d + " ");
}
    }
}
