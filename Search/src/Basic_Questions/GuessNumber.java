package Basic_Questions;

public class GuessNumber {

    public static long guessNumber(int n, int picked_number) {
        long start = 0, end = n;
        int api_value = -2;
        long ans = 0;
        while(start <= end){
            long guess_num = (start + end)/2;
            System.out.println("Guess Number: "+guess_num);
            api_value = guess(guess_num, picked_number);
            System.out.println("Api Value: "+api_value);
            if(api_value == 0){
                ans = guess_num;
                return ans;
            }
            else if(api_value == 1){
                start = guess_num +1;
            }
            else{
                end = guess_num -1;
            }
        }
        return ans;

    }


    public static int guess(long num, int picked_number){
        if(num == picked_number){
            return 0;
        }
        else if(num < picked_number){
            return 1;
        }
        else{
            return -1;
        }
    }
    public static void main(String... strings){

        int picked_number = 1702766719;
        int n = 2126753390;
        //int picked_number = 6;
       // int n = 2000;
        System.out.println(guessNumber(n, picked_number));
    }
}
