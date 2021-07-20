package Basic_Questions;

public class Sqrt {

    public static int sqrt(int x){
        long start_index = 1, last_index = x, ans = 0;
        while(start_index <= last_index){
            System.out.println("Start Index: "+start_index);
            System.out.println("Last Index: "+last_index);

            long mid = (start_index + last_index) / 2;
            System.out.println("Print Mid: "+mid);
            if(mid * mid == x){
                ans = mid;
                System.out.println("Returning from here");
                return (int)ans;
            }
            else if(mid * mid < x){
                start_index = mid + 1;
                ans = mid;
                System.out.println("Ans : "+ans);
            }
            else{
                last_index = mid - 1;
            }
        }
        return (int)ans;
    }


    public static void main(String... strings){
        int x=18;
        System.out.println(sqrt(x));
    }
}
