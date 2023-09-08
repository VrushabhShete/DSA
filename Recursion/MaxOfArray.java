public class MaxOfArray{
    static int arr[] = {3, 55, 2, 42, 78};

    static int longest (){
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max)
            max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max is "+longest());
    }
}