package Basic_Questions;

public class CheckLastOccurance {

    public int searchOccuranceRecursively(int[] array, int left_index, int right_index, int target) {
        if(left_index > right_index){
            System.out.println(-1);
            return -1;
        }
        int mid_index = (right_index + left_index)/2;
        if(array[mid_index] > target){
            return searchOccuranceRecursively(array, left_index, mid_index-1, target);
        }
        else if(array[mid_index] < target){
            return searchOccuranceRecursively(array, mid_index+1, right_index, target);
        }
        else{
            if(mid_index == (array.length-1) || array[mid_index] != array[mid_index+1]){
                return mid_index;
            }
            else{
                return searchOccuranceRecursively(array, mid_index+1, right_index, target);
            }
        }
    }

    public static void main(String... strings){
        CheckLastOccurance checkLastOccurance = new CheckLastOccurance();
        //int[] array = {1,1,2,10,10,10,20,20,30,40,90};
        int[] array = {5,10,10,10,10,20,20};
        int resultIndex = checkLastOccurance.searchOccuranceRecursively(array,
                0, array.length-1, 10);
        System.out.println(resultIndex);
    }

}
