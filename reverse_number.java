// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 47892;
        String reverse_num = "";
        while(n > 0){
            int lastdigit = n%10;
            System.out.println(lastdigit);
            n = n/10;
            reverse_num = reverse_num + lastdigit;
        }
        
        System.out.print(reverse_num);
    }
}