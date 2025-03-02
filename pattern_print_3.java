// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       
       Scanner scan = new Scanner(System.in);
       
       int n = scan.nextInt();
       scan.nextLine();
       scan.close();
       for(int i=n; i>=1; i--){
           for(int j=i; j>=1; j--){
               System.out.print(j);
           }
           System.out.println("");
       }
    
    }
}

/**
 * 
 * 
654321
54321
4321
321
21
1

 */