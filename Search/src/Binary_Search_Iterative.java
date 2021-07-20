import com.sun.deploy.panel.JHighDPITable;

public class Binary_Search_Iterative {


    protected static void binary_search(int[] array, int search_element){
        int low_index = 0;
        int high_index = array.length -1;
        int mid_index;
        while(low_index <= high_index){

            mid_index = low_index + ( high_index - low_index )/2;
            System.out.println("Mid Index " +mid_index);
            if(array[mid_index] == search_element){
                System.out.println("Element is present");
                System.out.println("Present at index: "+mid_index);
                return;
            }
            else if(array[mid_index] > search_element){
                high_index = mid_index - 1;
            }
            else{
                low_index =mid_index + 1;
            }
        }
        System.out.println("Element is not present");

    }

    public static void main(String... string){
        int[] array = {1,2,3,4,5,6,7,8,9,10,11};
        int search_element = 16;
        binary_search(array, search_element);

    }
}
