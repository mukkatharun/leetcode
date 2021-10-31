class Solution {
    public int countPrimes(int n) {
        boolean[] s = new boolean[n];
        
        if(n<2) return 0;
        int count = 0;
        for(int i = 2; i< n; i++) {
            if(!s[i]) count++;
            for(int j=i+i;j<n;j=j+i) {
                s[j] = true;
            }
        }
        return count;
    }
}
