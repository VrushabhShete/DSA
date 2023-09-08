public class Selection {

    static void Selectionsort(int[] arr, int n){
        int min;
        for(int i=0; i < n-1; i++){
            min = i;
            for(int j= i+1; j < n; j++){
                if(arr[j] < arr[i])
                min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 4, 8, 14, 9};
        Selectionsort(arr, arr.length);
        System.out.println("The sorted array is : ");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }    
}
