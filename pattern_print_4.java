// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       
       Scanner scan = new Scanner(System.in);
       
       int n = scan.nextInt();
       scan.nextLine();
       scan.close();
       for(int i=1; i<=n; i++){
           for(int j=1; j<=i; j++){
               System.out.print("*");
           }
           System.out.println("");
       }
    
    }
}
/**
 
*
**
***
****
*****
******

=== Code Execution Successful ===
 */