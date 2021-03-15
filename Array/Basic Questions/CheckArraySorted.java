public class CheckArraySorted {
    public static boolean check_sorted(int[] array){
        boolean sorted_flag = true;
        if(array.length == 0){
            return sorted_flag;
        }
        for(int i =0; i < array.length-1; i++){
            if(array[i] > array[i+1]){
                sorted_flag = false;
                break;
            }
            System.out.println(i);
        }
        return sorted_flag;
    }

    public static void main(String arg[]){
        int[] arr = {2,4,5,6,11,10,10,22};

        boolean sorted_flag = check_sorted(arr);
        if(sorted_flag == true){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}
