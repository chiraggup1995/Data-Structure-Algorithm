public class Remove_Duplicate_From_Sorted_Array {

    public static int remove_duplicate(int[] array){
        int size = array.length;
        int duplicate_element_index = 1;
        for(int i =1; i < size;i++) {
            if (array[i] != array[duplicate_element_index - 1]) {
                array[duplicate_element_index] = array[i];
                duplicate_element_index++;
            }
        }
        //System.out.println("Return Size: "+(duplicate_element_index));
        return (duplicate_element_index);
    }


    public static void main(String arg[]) {
        int[] array = {2,2,3,3,3,10,10,11,101,101};
        int new_array_length = remove_duplicate(array);
        for (int i =0; i < new_array_length; i++){
            System.out.println(array[i]);
        }
    }
}