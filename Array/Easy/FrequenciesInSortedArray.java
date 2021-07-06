package Easy;

public class FrequenciesInSortedArray {

    public void findLeader(int[] nums){
        int count = 1;
        for(int i =1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }
            else{
                System.out.println(nums[i-1]+" "+count);
                count =1;
            }
        }
        System.out.println(nums[nums.length-1]+" "+count);
    }

    public static void main(String... strings){
        FrequenciesInSortedArray frequenciesInSortedArray = new FrequenciesInSortedArray();
        //int[] nums = {10,10,10,25,30,30};
        int[] nums = {10,20,30,40};
        frequenciesInSortedArray.findLeader(nums);

    }
}
