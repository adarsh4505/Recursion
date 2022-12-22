import java.util.Scanner;

public class findOccurence {
    public static int  first = -1;
    public static int last = -1;
    public static void find(String str, int idx, char c){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == c ){
            if(first == -1)
            {
                first = idx;
            }
            else{
                last = idx;
            }

        }
        find(str, idx+1, c);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        System.out.println("Enter the character whose occurrence to be found : ");
        char c = sc.next().charAt(0);
        find(str,0,c);


    }
}
