// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 478925678;
        int counter = 0;
        String reverse_num = "";
        int oddcount = 0;
        int evencount = 0;
        while(n > 0){
            int lastdigit = n%10;;
            n = n/10;
            counter++;
            reverse_num = reverse_num + lastdigit;
            if(n==0){
                System.out.println("First digit: " + lastdigit);
            }
            
            if(lastdigit % 2 != 0){
                oddcount++;
            }else{
                evencount++;
            }
        }
        
        System.out.println(reverse_num);
        System.out.println("Number of digits: " + counter);
        System.out.println("Odd Number of digits: " + oddcount);
        System.out.println("Even Number of digits: " + evencount);
        
    }
}