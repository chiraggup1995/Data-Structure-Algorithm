package Easy;

public class LeaderInArray {

    public void findLeaders(int[] nums){
        int max = -1;
        int n = nums.length-1;
        while(n >= 0){
            if(nums[n] > max){
                System.out.println(nums[n]);
                max =nums[n];
            }
            n--;
        }

    }

    public static void main(String... strings){
        LeaderInArray leaderInArray = new LeaderInArray();
        //int[] nums = {7,10,4,10,6,5,2};
        int[] nums = {10,0,20,30,10,5,4,2};
        leaderInArray.findLeaders(nums);

    }
}
