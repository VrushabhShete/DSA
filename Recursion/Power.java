public class Power{
    
    int base, x;

    static int power(int base, int x){
        if (x==0){
            return 1;
        }
        return (base * power(base, x-1));
    }
    public static void main(String[] args) {
        System.out.println("The power is "+ power(5,3));
    }
}
