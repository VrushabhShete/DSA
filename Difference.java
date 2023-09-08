import java.util.Scanner;

public class Difference {

    static int finalTotal(int[] arr, int num, int diff){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(((arr[i]-num)<=diff) && ((num-arr[i])<=diff)) 
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int diff = sc.nextInt();

        System.out.println(finalTotal(arr, num, diff));
    }
}
