public class ReverseNumber{
    static int x = 0;

    static int reverse(int num){
        if (num>0){
            x = (x*10) + num%10;
            reverse(num/10);
        }  
        return x;
    }

    public static void main(String[] args) {
        int num = 3567;
        System.out.println(reverse(num));
    }
}