// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Num:");
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if(num+num2+num3 == 180){
            System.out.println("Triangle can be formed");
        }else{
            System.out.println("Triangle can not be formed");
        }
        

    }
}