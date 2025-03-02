// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 4;
        int ans = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
                System.out.print(ans);
                ans++;
            }
            System.out.println("");
        }
    }
}

//output

 1
 2 3
 4 5 6
 7 8 9 10