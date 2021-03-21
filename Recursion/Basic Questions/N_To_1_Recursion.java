package Basic;

public class N_To_1_Recursion {
    public static void N_To_1_Recursion (int n){
        //Base Condition
        if(n == 0){
            return;
        }
        System.out.println(n);
        N_To_1_Recursion(n-1);
    }
    public static void main(String... strings){
        N_To_1_Recursion(5);
    }
}
