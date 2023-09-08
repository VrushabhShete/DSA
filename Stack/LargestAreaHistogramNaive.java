public class LargestAreaHistogramNaive {

    static void largestArea(int[] arr, int n){
        int max = 0;
        
        for(int i = 0; i<n; i++){
            int count = 1;
            for(int j=i+1; j<n; j++){
                if(arr[j] > arr[i])
                count++;
                else break;
            }
            for(int k=i-1; k>=0; k--){
                if(arr[k] > arr[i])
                count++;
                else break;
            }
            if((count * arr[i]) > max)
            max = count * arr[i];
        }

        System.out.println("The max is "+ max);
    }

    public static void main(String[] args) {
        int[] arr = {11, 3, 4, 4, 1, 5, 7};
        int n = arr.length;
        largestArea(arr, n);
    }
}
