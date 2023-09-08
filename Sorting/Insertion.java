public class Insertion{

    static void insertionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j -=1;
            }
            arr[j+1] = temp;
        }
        System.out.println("After sorting the array is");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 23, 4, 6, 9, 12, 28};
        insertionSort(arr);
    }
}