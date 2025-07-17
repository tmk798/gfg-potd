class Solution {
    public int[] sieve(int n) {
        // code here
        boolean[] boarr=new boolean[n+1];
        List<Integer> vals = new ArrayList<>();
        
        for(int i=2;i<=n;i++)
        {
            boarr[i]=true;
        }
        for(int j=2;j<=Math.sqrt(n);j++)
        {
            for(int m=2*j;m<=n;m+=j)
            {
                if(boarr[j]){
                boarr[m]=false;
                }
            }
            

        }
        for(int k = 0;k<=n;k++)
        {
             if(boarr[k]){
                vals.add(k);
                }
            
        }
        int[] result = new int[vals.size()];
        for(int a =0;a<vals.size();a++){
            result[a]=vals.get(a);
        }

        return result;
    }
}