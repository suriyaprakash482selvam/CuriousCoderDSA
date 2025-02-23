// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Input");
        int x = scan.nextInt();
        
        for(int i=x; i<=1000; i=i+100){
            System.out.println(i);
        }
    }
}