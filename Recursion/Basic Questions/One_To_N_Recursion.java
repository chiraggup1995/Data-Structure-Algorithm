package Basic;

public class One_To_N_Recursion {

    public static void one_To_N_Recursion(int n){
        //set Base Condition
        if(n ==0){
            return;
        }
        one_To_N_Recursion(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        one_To_N_Recursion(5);
    }
}
