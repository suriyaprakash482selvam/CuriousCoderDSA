// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Num:");
        int num = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Name:");
        String name = scan.nextLine();
        System.out.println("Enter Char:");
        String charac = scan.nextLine();
        
        System.out.println(num);
        System.out.println(name);
        System.out.println(charac);
    }
}