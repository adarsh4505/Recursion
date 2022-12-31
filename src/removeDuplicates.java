import java.util.Scanner;

public class removeDuplicates {
    public static boolean[] map = new boolean[26];
    public static void remove(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            remove(str,idx+1,newString);

        }else{
            newString += currChar;
            map[currChar - 'a'] = true;
            remove(str,idx+1, newString);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        remove(str,0,"");
    }
}
