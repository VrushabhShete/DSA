import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SecondGreatest {

    static int secondSum(int[] arr, int n){
        if (n<=3)
        return 0;

        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        even.add(arr[0]);
        for(int i=1; i<n; i++){
            if(i%2==0)
            even.add(arr[i]);
            else
            odd.add(arr[i]);
        }
        Collections.sort(odd);
        Collections.sort(even);

        int finalSum = (odd.get(odd.size() - 2)) + (even.get(even.size() - 2));
        return finalSum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The second greatest sum is : " + secondSum(arr, arr.length));
    }
}
