public class NextGreaterNaive {

    static void nextGreater(int[] arr, int n){
        for(int i=0; i < n; i++){
            boolean flag = false;
            for(int j= i+1; j<n; j++){
                if(arr[j] > arr[i]){
                    System.out.println(arr[j] + " ");
                    flag = true;
                    break;
                }                
            }
            if(flag == false)
            System.out.println("- ");
        }
    }

    public static void main(String[] args) {
        int[] arr={30, 50, 20, 15, 25};
        int size = arr.length;
        nextGreater(arr, size);
    }
}
