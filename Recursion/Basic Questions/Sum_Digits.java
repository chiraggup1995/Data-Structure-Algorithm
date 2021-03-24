package Basic;

public class Sum_Digits {

    //TC: T(1) + T(n-1)
    protected static int sum_digits(int n){
        //Base Condition
        if(n == 0){
            return 0;
        }
        return n% 10 + sum_digits(n/10);
    }

    public static void main(String... args){
        System.out.println(sum_digits(10));
    }
}
