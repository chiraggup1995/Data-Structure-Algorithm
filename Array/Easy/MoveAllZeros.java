package Easy;

public class MoveAllZeros {

    public void moveZeros(int[] nums){
        int i =0;
        int j =0;
        while(i < nums.length && j < nums.length){
            if(nums[i] != 0 && nums[j] == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if(nums[j] != 0){
                j++;
            }
            i++;
        }
        print(nums);
    }

    public void print(int[] nums){
        for(int i: nums){
            System.out.print(i+" ");
        }
    }


    public static void main(String... strings){
        MoveAllZeros moveAllZeros =new MoveAllZeros();
        //int[] nums = {8,5,0,1,0,20};
        //int[] nums = {0,0,0,1,0,20,0};
        int[] nums ={10,20};
        moveAllZeros.moveZeros(nums);

    }
}
