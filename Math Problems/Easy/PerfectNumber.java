package Easy;


//Perfect Number is the number whose sum of divisors is equal to number
//For example 6: 1,2,3
//For example 28: 1,2,4,7,14
public class PerfectNumber {

    public void findPerfectNumber(int num){
        int sum =1 ;
        for(int i = 2; i * i <= num; i++){
            int quotient = num / i;
            int remainder = num % i;
            if(remainder == 0 && i <= quotient){
                if(i == quotient){
                    sum = sum + i;
                }
                else{
                    sum = sum + quotient + i;
                }
            }
        }
        if(sum == num){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static void main(String... strings){
        PerfectNumber perfectNumber = new PerfectNumber();
        perfectNumber.findPerfectNumber(18);
        perfectNumber.findPerfectNumber(28);
        perfectNumber.findPerfectNumber(38);

    }
}
