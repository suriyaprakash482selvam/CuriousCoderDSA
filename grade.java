// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Num:");
        int mark = scan.nextInt();
        if(mark >=90){
            System.out.println("Grade A");
        }else if(mark >= 80){
            System.out.println("Grade B");
        }else if(mark >= 60){
            System.out.println("Grade C");
        }else if(mark >= 35){
            System.out.println("Grade D");
        }else{
            System.out.println("Fail");
        }
        

    }
}