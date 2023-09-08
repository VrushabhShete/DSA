import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

public class MinimumSwaps {

    static int findSwaps(int[] a, int n){
        int min = 0; int count = 0;
        boolean flag = false;
        for(int i=0; i<n-1; i++){
           for(int j=i+1; j<n; j++){
            if(a[j] < a[i]){
            min = a[j];
            flag = true;
           }
        }
           if(flag == true){
                int temp = min;
                min = a[i];
                a[i] = temp;
                count++;
           }

        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println(findSwaps(a, n));
    }
}
