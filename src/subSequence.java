import java.util.Scanner;

public class subSequence {
    public static void subsequence(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
//        to be
        subsequence(str,idx+1,newString+currChar);
//        not to be
        subsequence(str,idx+1,newString);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        subsequence(str,0,"");

    }
}
