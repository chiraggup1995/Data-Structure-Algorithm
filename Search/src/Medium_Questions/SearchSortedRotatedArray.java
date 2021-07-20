package Medium_Questions;

public class SearchSortedRotatedArray {

    public void findSearch(int[] array, int target){
        int left_index = 0;
        int right_index = array.length-1;
        while(left_index <= right_index){
            int mid_index = (left_index + right_index) /2;
            //If Mid Index Element is the target
            //Print & return
            if(array[mid_index] == target){
                System.out.println(mid_index);
                return;
            }
            //If Left Array is Sorted
            if(array[mid_index] > array[left_index]){
                //Check whether target lie in range of left array (start and end index)
                if(array[left_index] <= target && array[mid_index-1] >= target){
                    right_index = mid_index -1;
                }
                //If above condition fails, target lie in other half array
                else{
                    left_index = mid_index+1;
                }
            }
            else {
                if(array[right_index] >= target && array[mid_index+1] >= target){
                    left_index = mid_index + 1;
                }
                else{
                    right_index = mid_index -1;
                }
            }
        }
        System.out.println("-1");
    }

    public static void main(String... strings){
        SearchSortedRotatedArray searchSortedRotatedArray = new SearchSortedRotatedArray();
        int[] array = {10,20,30,40,50,8,9};
        searchSortedRotatedArray.findSearch(array, 500);
    }
}
