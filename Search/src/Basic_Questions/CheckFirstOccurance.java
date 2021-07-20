package Basic_Questions;

public class CheckFirstOccurance {
    public void searchOccurance(int[] array, int target){
        int left_index = 0;
        int right_index = array.length-1;
        int mid_index =-1;
        while(left_index <= right_index){
            mid_index = (right_index - left_index / 2);
            if(array[mid_index] == target){
                break;
            }
            else if(array[mid_index] > target){
                right_index = mid_index-1;
            }
            else{
                left_index = mid_index+1;
            }
        }

        if(left_index > right_index){
            System.out.println("Target not present");
            return;
        }
        int i = mid_index;
        while(i >= 0){
            if(array[i] != target){
                System.out.println(i+1);
                return;
            }
            i--;
        }
        System.out.println(i+1);
    }
    public static void main(String... strings){
        CheckFirstOccurance checkFirstOccurance = new CheckFirstOccurance();
        int[] array = {1,1,2,10,10,10,20,20,30,40,90};
        checkFirstOccurance.searchOccurance(array, 40);

    }
}
