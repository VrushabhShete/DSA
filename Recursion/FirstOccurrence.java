import java.util.Scanner;

public class FirstOccurrence {

    static int first(int[] arr, int idx, int num){
        
        if(idx == arr.length)
        return -1;
        else if(arr[idx] == num){
            return idx;
        }
        int ans = first(arr, idx+1, num);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();

        System.out.println(first(arr, 0, num));
    }
}
