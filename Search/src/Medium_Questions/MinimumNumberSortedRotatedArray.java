package Medium_Questions;

public class MinimumNumberSortedRotatedArray {
    public int minNumber(int arr[], int low, int high) {
        // Your code here
        if(arr.length == 1){
            return arr[0];
        }
        int mid_index = (low+high) / 2;
        if(mid_index == 0 && arr[mid_index] < arr[mid_index+1]){
            System.out.println(arr[mid_index]);
            return arr[mid_index];
        }
        if(mid_index == arr.length-1 && arr[mid_index] < arr[mid_index-1]){
            System.out.println(arr[mid_index]);
            return arr[mid_index];
        }
        if(arr[mid_index] < arr[mid_index+1] && mid_index > 0 && arr[mid_index] < arr[mid_index-1]){
            System.out.println(arr[mid_index]);
            return arr[mid_index];
        }
        if(arr[mid_index] > arr[low]){
            if(arr[mid_index] > arr[high]){
                return minNumber(arr, mid_index+1, high);
            }else{
                return minNumber(arr, low, mid_index-1);
            }
        }else{
            if(arr[mid_index] < arr[high]){
                return minNumber(arr, low, mid_index-1);
            }
            else{
                return minNumber(arr, mid_index+1, high);
            }
        }

    }

    public static void main(String... strings){
        MinimumNumberSortedRotatedArray minimumNumberSortedRotatedArray = new MinimumNumberSortedRotatedArray();
        int[] arr = {6,1,2,3,4,5};
        minimumNumberSortedRotatedArray.minNumber(arr, 0, arr.length-1);
    }
}
