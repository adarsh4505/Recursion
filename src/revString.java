import java.util.Scanner;

public class revString {
    public static void rev(String Str, int idx) {
        if (idx == 0) {
            System.out.println(Str.charAt(idx));
            return;
        }
        System.out.print(Str.charAt(idx));
        rev(Str, idx - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to be reversed : ");
        String Str = sc.nextLine();
        rev(Str, Str.length() - 1);


    }
}
