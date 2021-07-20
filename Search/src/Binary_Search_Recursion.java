public class Binary_Search_Recursion {

    public static int BS_Recursion(int[] array, int x, int start_index, int last_index){
        int mid_index = (start_index + last_index)/2;
        if(start_index  > last_index){
            System.out.println("-1");
            return -1;
        }
        if (array[mid_index] == x){
            System.out.println("0");
            return 0;
        }
        if(array[mid_index] > x){
            last_index = mid_index - 1;
        }
        else{
            start_index = mid_index + 1;
        }
        return BS_Recursion(array, x, start_index, last_index);
    }

    public static void main(String... s){
        int[] array = {1,2,3,4,5,6,7,8,9};
        int x = 11;
        int start_index = 0;
        int last_index = array.length - 1;
        BS_Recursion(array, x, start_index, last_index);
    }
}
