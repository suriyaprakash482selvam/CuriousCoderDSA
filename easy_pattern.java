import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int n = 0;
        int i=1;
        
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        if(n<0 || n>100){
            return;
        }
        
        for(int j=1; j<=n; j++){
            for(int k=1; k<=n; k++){
                System.out.print(i);
                i++;
            }
            System.out.println("");
        }
            
    }
}