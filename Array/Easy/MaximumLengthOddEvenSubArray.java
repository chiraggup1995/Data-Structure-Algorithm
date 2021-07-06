package Easy;

public class MaximumLengthOddEvenSubArray {

    public void findLargestSubarray(int[] array){
        int count =1;
        int maxCount = count;
        for(int i = 1; i < array.length; i++){
            if((array[i] % 2 ==0 && array[i-1] % 2 != 0) || (array[i] % 2 !=0 && array[i-1] % 2 == 0)){
                count++;
                maxCount = Math.max(count, maxCount);
            }
            else{
                count = 1;
            }
        }
        System.out.println(maxCount);
    }

    public static void main(String... strings){
        MaximumLengthOddEvenSubArray maximumLengthOddEvenSubArray = new MaximumLengthOddEvenSubArray();
        //int[] nums = {10,12,14,7,8,8,6,4,5,3,2,3,1,4,5,6};
        //int[] nums = {10, 12, 18, 14};
        int[] nums = {7,10,13,14};
        maximumLengthOddEvenSubArray.findLargestSubarray(nums);

    }
}
