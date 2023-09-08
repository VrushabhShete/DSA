import java.util.*;

class PrevGreaterOptimized {

    static void prevGreater(int[] arr, int size) {

        Stack<Integer> s = new Stack<>() ;
        s.add(arr[0]);

        System.out.print("- ");
        for (int i = 1 ; i < size; i++) {
            while (s.isEmpty() == false && s.peek() <= arr[i])
            {
                s.pop();
            }
            if (s.empty())
                System.out.print("- ");
            else
                System.out.print(s.peek() + " ");

            s.push(arr[i]);
        }

    }

    // Driver code
    public static void main(String[] args)
    {
        int[] arr = {100, 20, 30, 60, 38, 36, 32, 55, 80, 50, 120};
        int size = arr.length;
        prevGreater(arr, size);

    }
}