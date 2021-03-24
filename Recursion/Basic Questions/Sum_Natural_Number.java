package Basic;

public class Sum_Natural_Number {


    //Time Complexity : T(n-1) + T(1)
    //Auxillary Space : T(n) every function create space in stack
    // and waits for child function to finish
    protected static int sum_Natural_Number(int n){
        if(n <= 1){
            return n;
        }
        return sum_Natural_Number(n-1) + n;
    }


    public static void main(String... strings){
        System.out.println(sum_Natural_Number(3));
    }
}
