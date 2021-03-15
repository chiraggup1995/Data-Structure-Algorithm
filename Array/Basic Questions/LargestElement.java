public class LargestElement {

    public static void find_largest(int[] array){
        if(array.length == 0)
        {
            return;
        }
        int largest_element = array[0];
        int largest_element_index =0;
        for(int i=1; i < array.length; i++){
            if(largest_element < array[i]) {
                largest_element = array[i];
                largest_element_index = i;
            }
        }
        System.out.println("Largest Element Index: " +largest_element_index);
    }

    public static void main(String args[]){
        int arr[] = {10,5,20,8};
        find_largest(arr);

    }
}
