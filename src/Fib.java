import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Fib {
    public static void fibonacci(int a, int b, int n){

   if(n == 0) {
       return;
   }
   System.out.println(a);
   fibonacci(b,a+b,n-1);


    }




    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int a = 0;
    int b = 1;


    fibonacci(a,b,n);

    }
}
