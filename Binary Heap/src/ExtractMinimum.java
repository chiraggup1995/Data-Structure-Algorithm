public class ExtractMinimum {

    //Main Function
    //Extract Minimum value from Min Heap and maintain Min Heap

    public void extractMin(int[] array, int n, int i){
        //Minimum is at root in Min Heap
        int smaller = i;
        int parent = i;
        int left_child = (2*i) + 1;
        int right_child = (2*i) + 2;

        if(left_child < n && array[smaller] < array[left_child]){
            parent = left_child;
        }
        if(right_child < n && array[smaller] < array[right_child]){
            parent = right_child;
        }
        if(left_child < n && right_child < n &&  array[left_child] < array[right_child]){
            parent = left_child;
        }
        if(parent != i){
            int temp = array[parent];
            array[parent] = array[i];
            array[i] = temp;
            extractMin(array, n, parent);
        }
        int last_element = n-1;
        if(parent == last_element){
           return;
        }
        else{
            //swap Parent element with last element of binary heap
            int temp = array[parent];
            array[parent] = array[last_element];
            array[last_element] = temp;
            //Check whether last element after swap is larger than parent or not
            int temp_parent = (parent-1)/2;
            if(array[temp_parent] > array[parent]){

//                int temp1 = array[temp_parent];
//                array[parent] = array[temp_parent];
//                array[temp_parent] = temp1;
            }
        }
        print(array,n-1 );
    }


    public void print(int[] arr, int size){
        for(int i =0; i < size; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }


    public static void main(String... strings){
        ExtractMinimum extractMinimum = new ExtractMinimum();
        int[]  array = {20,25,30,35,40,80,32,100,70,60};
        extractMinimum.print(array, array.length);
        extractMinimum.extractMin(array, array.length, 0);
        System.out.println(-1/2);
        //extractMinimum.print(array);
    }
}
