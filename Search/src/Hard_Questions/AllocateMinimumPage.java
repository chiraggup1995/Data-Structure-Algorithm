package Hard_Questions;

public class AllocateMinimumPage {

    //Function to find minimum number of pages.
    //m = Number of Students

    public int findPages(int[]a,int n,int m)
    {
        //Your code here
        //Find max value in the array
        int result = 0;
        int max = a[0];
        int sumArray = a[0];
        for(int i =1; i < n; i++){
            sumArray += a[i];
                if(max < a[i]){
                    max = a[i];
                }
        }

        int left_index = max;
        int right_index = sumArray;

        while(left_index <= right_index){
            int mid = (left_index + right_index) / 2;
            if(isPossible(a, mid, m)){
                result = mid;
                right_index = mid-1;
            }
            else{
                left_index = mid+1;
            }
        }
        System.out.println(result);
        return result;
    }

    public static boolean isPossible(int[] a, int maxValue, int m){

        int count = 1;
        int sum =0;
        for(int i = 0; i < a.length; i++){
            if(sum + a[i] <= maxValue){
                sum = sum + a[i];
            }else{
                count++;
                sum = a[i];
                if(count > m){
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String... strings){
        AllocateMinimumPage minimumPage = new AllocateMinimumPage();
        //int[] arr = {10,20,30,40};
        int[] arr = {12,34,67,90};
        minimumPage.findPages(arr, arr.length, 2);

    }
}
