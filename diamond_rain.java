import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int n= 0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j=i; j<=n-1; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = n; i>=1; i--){
            
            for(int j=i; j<=n-1; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
}