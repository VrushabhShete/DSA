class PrevGreaterNaive {

    static void prevGreater(int[] arr, int size) {

        for (int i = 0; i < size; i++) {
            boolean flag = false;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    System.out.print(arr[j] + " ");
                    flag = true;
                    break;
                }
            }
            if (flag == false)
                System.out.print("- ");
        }
    }


    // Driver code
    public static void main(String[] args)
    {
        int[] arr = {25, 15, 20, 50, 30};
        int size = arr.length;
        prevGreater(arr, size);

    }
}