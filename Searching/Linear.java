import java.util.*;

public class Linear {

    static void linearsearch (int[] arr, int key){

        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                int position = i+1;
                System.out.println("Key found at "+position+ " position");
                break;
            }
            else
            System.out.println("Key not found");    
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {6, 4, 8, 9, 2, 3};
        System.out.println("The array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println("\nEnter a key to search: ");
        int key = sc.nextInt();
        linearsearch(arr, key);
    }
}
