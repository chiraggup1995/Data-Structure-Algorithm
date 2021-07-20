package Basic_Questions;

public class FindPeakNumber {

    public void findPeak(int[] arr){
        int left_index = 0;
        int right_index = arr.length-1;
        while(left_index <= right_index){
            int mid_index = (left_index+right_index)/2;
            if(mid_index - 1 >= 0 && arr[mid_index] > arr[mid_index-1]
                    && mid_index+1 < arr.length && arr[mid_index] >= arr[mid_index+1]){
                System.out.println(arr[mid_index]);
                return;
            }
            //If Search Element is First Element & it is greater than second element
            if(mid_index == 0 && arr[mid_index] >= arr[mid_index+1]){
                System.out.println(arr[mid_index]);
                return;
            }
            //If Search Element is Last Element & it is greater than previous element
            if(mid_index == arr.length-1 && arr[mid_index] >= arr[mid_index-1]){
                System.out.println(arr[mid_index]);
                return;
            }
            if(mid_index - 1 >= 0 && arr[mid_index] < arr[mid_index - 1]){
                right_index = mid_index -1;
            }
            else if((mid_index + 1 < arr.length) && arr[mid_index] < arr[mid_index+1]){
                left_index = mid_index + 1;
            }
        }
    }
    public static void main(String... strings){
        FindPeakNumber findPeakNumber =new FindPeakNumber();
       // int[] arr = {10,20,15,5,23,90,67};
        int[] arr = {1,2,3};
        findPeakNumber.findPeak(arr);
    }
}
