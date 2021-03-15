public class Reverse_Array {

    public static int[] reverse_array(int[] array){
        int start_index=0;
        int last_index = array.length -1;
        while(start_index != last_index && last_index > start_index){
            System.out.println("Start Index: "+start_index);
            System.out.println("Last Index: "+last_index);
            int temp = array[last_index];
            array[last_index] = array[start_index];
            array[start_index] = temp;
            start_index++;
            last_index --;
        }
        return array;
    }
    public static void main(String arg[]){
        int[] array = {10,101,10,11,2};
        int[] new_array = reverse_array(array);
        for (int element : new_array) {
            System.out.println(element);
        }
    }
}
