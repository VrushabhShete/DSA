public class RainwaterTrapping {

    static void maximum(int[] arr){
        int max = 0;
        for(int i=0; i < arr.length - 1; i++){
            for(int j=0; j< arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp1 = j - i;
                    int temp2 = arr[j] * temp1;
                    if(temp2 > max)
                    max = temp2;
                }
                else if(arr[j] > arr[i]){
                    int temp1 = j - i;
                    int temp2 = arr[i] * temp1;
                    if(temp2 > max)
                    max = temp2;
                }
            }
        }
        System.out.println(max);
    }


    public static void main(String[] args) {
        int[] arr = {3, 7, 4, 1, 5, 3, 7, 3, 6};
        maximum(arr);
    }
}
