import java.util.Scanner;

public class ProductSmallestPair {

    static int smallestPair(int sum, int[] arr, int n){
        int temp, plus, prod;
        if(n<2)
        return -1;
        for(int i=0; i<n; i++){
            for(int j=n-1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        for(int i=0; i<n; i++){
          if(arr[i] != arr[i+1]){
              break;
            }
        }
        plus = arr[0] + arr[1];
        prod = arr[0] * arr[1];
        
        if(plus<=sum)
        return prod;
        else
        return 0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(smallestPair(sum, arr, n)); 
    }
}
