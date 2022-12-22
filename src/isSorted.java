import java.util.Scanner;

public class isSorted {
    public static boolean Sorted(int[] arr,int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] >= arr[idx+1]){
           return false;
        }

            return Sorted(arr, idx+1);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Sorted(arr,0));
    }
}
