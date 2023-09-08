import java.util.Scanner;

public class MaxInArray {

    static int findMax(int[] arr, int idx){
        if(idx == arr.length){
            return 0;
        }
        int max = findMax(arr, idx+1);
        if(max < findMax(arr, idx)){
            max = arr[idx];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findMax(arr, 0));
    }
}
