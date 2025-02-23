// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter firstName");
        String firstName = scan.nextLine();
        System.out.println("Enter LastName");
        String lastName = scan.nextLine();
        System.out.println("Enter n");
        int n = scan.nextInt();
    
        for(int i=0; i<n; i++){
            System.out.println(firstName + ' ' + lastName);
        }
    }
}