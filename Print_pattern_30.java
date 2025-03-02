import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j<=i){
                    System.out.print(i);
                }else{
                    System.out.print(j);
                }
            }
            System.out.println("");
        }
    }
}