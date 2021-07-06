package Easy;

public class StockBuyAndSell {

    public void maxProfit(int[] nums)
    {
        int i =1;
        int buy_index = 0;
        int result = 0;
        while(i < nums.length){
            if(nums[i] <= nums[i-1]){
                result = result + (nums[i-1] - nums[buy_index]);
                buy_index = i;
            }
            if(nums[buy_index] > nums[i]){
                buy_index = i;
            }
            i++;
        }
        if(buy_index != nums.length-1){
            result = result + (nums[nums.length-1] - nums[buy_index]);
        }
        System.out.println("Max Profit: "+result);
    }

    public static void main(String... strings){
        StockBuyAndSell stockBuyAndSell = new StockBuyAndSell();
        int[] nums = {1,5,3,8,12};
        int[] nums1 = {1,5,3,1,2,12};
        int[] nums2= {1,5,5,5,5,5};
        int[] nums3 = {1,5,3,8,9,12};
        int[] nums4 = {1,5,3,8,12};
        int[] nums5 = {14,11,9,8,1};
        int[] nums6 = {1,5,7,8,12};
        stockBuyAndSell.maxProfit(nums);
        stockBuyAndSell.maxProfit(nums1);
        stockBuyAndSell.maxProfit(nums2);
        stockBuyAndSell.maxProfit(nums3);
        stockBuyAndSell.maxProfit(nums4);
        stockBuyAndSell.maxProfit(nums5);
        stockBuyAndSell.maxProfit(nums6);

    }
}
