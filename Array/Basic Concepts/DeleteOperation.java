public class DeleteOperation {

    public static int delete(int[] array, int delete_number, int array_size){
        int i;
        //Search for the number to be delete
        for(i =0; i < array.length; i++){
            if(delete_number == array[i]){
              break;
            }
        }
        //If number is not found return original array with original size
        if(i == array_size ){
            return array_size;
        }
        for(int j =i; j < array.length - 1; j++){
            array[j] = array[j+1];
        }
        return array_size-1;
    }


    public static void main(String args[]){
        int array[] = {3,8,6,12,5};
        int delete = 6;
        int modified_array_size = delete(array, delete, array.length);
        for(int x =0; x <modified_array_size; x++){
            System.out.println(array[x]);
        }
    }
}
