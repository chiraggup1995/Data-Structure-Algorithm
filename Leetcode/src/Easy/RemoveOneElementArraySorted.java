package Easy;


//1909
public class RemoveOneElementArraySorted {


    public boolean canBeIncreasing(int[] nums){
        int count = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= nums[i-1]){
                count++;
                if(i-2>=0 && i+1 <nums.length && nums[i] <= nums[i-2] && nums[i+1] <= nums[i-1]){
                    return false;
                }
            }
        }
        if(count <= 1){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String... strings){
        RemoveOneElementArraySorted removeOneElementArraySorted = new RemoveOneElementArraySorted();
        int[] nums = {2,3,1,4};
        boolean result = removeOneElementArraySorted.canBeIncreasing(nums);
        System.out.println(result);

    }
}
