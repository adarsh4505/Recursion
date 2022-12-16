import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Main1 {
    public static void num1(int n, int m){
        if(n > m) {
            return;
        }

            System.out.println(n);
        num1(n+1, m);
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        num1(n,m);
        
    }
}
