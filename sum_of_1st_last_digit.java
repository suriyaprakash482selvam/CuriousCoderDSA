class Solution
{
    public int corner_digitSum(int n)
    {
        
        int firstdigit = 0;
        int lastdigit = 0;
        
        int i = 1;
        while(n>0){
            
            int ld = n % 10;

            if(i == 1){
                lastdigit = ld;
            }
            
            n = n/10;
            
            
            if(n == 0){
                firstdigit = ld;
            }
            
            if(i==1 && n==0){
                return lastdigit;
            }
            i++;
        }
        
        return firstdigit + lastdigit;
    }
}