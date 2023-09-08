public class Bubble{

    static void bubblesort(int[] arr){
        for(int i = 0; i< a.length; i++){
            for(int j=0; j< a.length-i-1; j++){
                if(arr[j] > arr[j+1])
                swap(arr[j], arr[j+1]);
            }
        }
    }

    static void swap(int n, int k){
        int temp = n;
        n = k;
        k = temp;
    }
    
    public static void main(String[] args) {
        int[] arr = {34, 222, 43, 75, 16, 9};
        bubblesort(arr);
        System.out.println("The sorted array is "+arr);
    }
}