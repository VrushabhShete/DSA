public class Fibonacci {

    void printFibonacci(int num1, int num2){
        if(num1 < 100){
            System.out.print(num1 + " ");
            printFibonacci(num2, num1 + num2);
        }
    }

    public static void main(String[] args) {
        Fibonacci fn = new Fibonacci();
        fn.printFibonacci(1, 2);
    }
}
