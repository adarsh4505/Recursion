import java.util.Scanner;

public class moveAllX {
    public static void moveX(String s, int idx, int count, String newS){
        if(idx == s.length()){
            for(int i = 0; i<count; i++){
                newS += 'x';
            }
//            System.out.println("New String is : "+ newS);
            System.out.println(newS);
            return;
        }
        char currChar = s.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveX(s,idx+1,count,newS);

        }
        else{
            newS += currChar;
            moveX(s, idx+1, count, newS);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        moveX(s,0,0, "");

    }
}
