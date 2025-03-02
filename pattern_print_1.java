class Solution{
    static void printPattern(int N){
        if(N<1 || N>1000){
            return;
        }
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }
}

/*

op:

* ** *** 

*/