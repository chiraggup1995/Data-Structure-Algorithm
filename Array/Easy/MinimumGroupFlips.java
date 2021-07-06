package Easy;

public class MinimumGroupFlips {

    public void flipArray(int[] nums){
        int count_one_group = 0;
        int count_zero_group = 0;
        int target = -1;
        if(nums[0] == 1){
            count_one_group++;
        }
        else{
            count_zero_group++;
        }

        //Find 0s & 1s Group Count
        for(int i = 1; i < nums.length;i++){
            if(nums[i] == 1 && nums[i-1] != 1){
                count_one_group++;
            }
            if(nums[i] == 0 && nums[i-1] != 0){
                count_zero_group++;
            }
        }

        //Check which group count is smaller
        if(count_one_group == 0 || count_zero_group == 0){
            return;
        }
        else if(count_one_group > count_zero_group){
            target = 0;
        }
        else{
            target = 1;
        }

        for(int j =0; j < nums.length; j++){
            if(nums[j] == target){
                System.out.print(j +" ");
            }
        }
        System.out.println("");

    }



        public static void main(String... strings){
        MinimumGroupFlips minimumGroupFlips = new MinimumGroupFlips();
        int[] nums = {1,0,0,0,1,0,0,1,1,1};
        int[] nums1 = {1,1,0,0,0,1};
        int[] nums2 = {0,1};
        int[] nums3 = {1,1};
        minimumGroupFlips.flipArray(nums);
        minimumGroupFlips.flipArray(nums1);
        minimumGroupFlips.flipArray(nums2);
        minimumGroupFlips.flipArray(nums3);

        }
}
