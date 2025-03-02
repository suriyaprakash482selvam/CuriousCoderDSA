class Solution{
    static long kthDigit(int A,int B,int K){
        long ans = (long) Math.pow(A, B);
        int i = 1;
        long n = ans;
        while(n > 0){
            long ld = n%10;
            if(i==K){
                return ld;
            }
            n = n/10;
            i++;
        }
        return -1;
    }
}