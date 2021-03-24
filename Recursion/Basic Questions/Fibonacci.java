package Basic;

public class Fibonacci {
    protected static int fibonacci(int n, int temp, int k) {
        //Base Condition
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return k;
        }
        System.out.println("Sum : " +(k+temp));
        return fibonacci(n-1, k, k+temp);
    }

    public static void main(String... args){
        System.out.println(fibonacci(4, 0, 1));
    }
}
