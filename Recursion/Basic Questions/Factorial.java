package Basic;

public class Factorial {

    //Without Tail Recusrion Method
    protected static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * fact(n-1);
    }

    //With Tail Recursion Method
    protected static int fact_tail_method(int n, int k){
        if(n == 0 || n == 1) {
            return k;
        }
        return fact_tail_method(n-1, k * n);
    }

    public static void main (String... args){
        System.out.println(fact(4));
        System.out.println(fact_tail_method(4, 1));
    }
}
