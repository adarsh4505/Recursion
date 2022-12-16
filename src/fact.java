import java.util.Scanner;

public class fact {
    public static void factorial(int n, int fact){
        if(n == 0){
            System.out.println(fact);
            return;
        }
        fact *= n;
        factorial(n-1,fact);



    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        factorial(n,fact);

    }
}

