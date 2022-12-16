import java.util.Scanner;

public class Main {
    public static void num(int n){
        if(n==0)
            return;
        System.out.println(n);

        num(n-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        num(n);


    }
}