package Easy;

public class TrappingRainWaterEasy {

    public void findVolume(int[] nums) {
        int volume  = 0;
        int left = 0;
        int leftTop = -1;
        int rightTop = nums.length - 1;
        int right = nums.length - 1;
        while (left < nums.length - 1) {
            if (nums[left] > nums[left + 1]) {
                leftTop = left;
                break;
            }
            left++;
        }
        while (right > 0) {
            if (nums[right] > nums[right - 1]) {
                rightTop = right;
                break;
            }
            right++;
        }
        int min = Math.min(nums[leftTop], nums[rightTop]);
        for (int i = leftTop + 1; i < rightTop; i++){
            volume = volume + (min - nums[i]);
        }
        System.out.print("Volume " +volume);
    }


    public static void main(String... strings) {
        TrappingRainWaterEasy trappingRainWaterEasy = new TrappingRainWaterEasy();
        //int[] arr = {3, 0, 1, 2, 5};
        int[] arr = {1,2,3,4,5,4,3,2,0,4};
        trappingRainWaterEasy.findVolume(arr);
    }
}
