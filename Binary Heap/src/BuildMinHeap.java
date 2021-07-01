public class BuildMinHeap {

    public void buildMinHeap(int[] array){
        for(int i = (array.length -1) / 2; i >= 0; i--){
            minHeapify(array,array.length, i);
        }
    }

    public void minHeapify(int[] array,int n, int i){
        int parent = i;
        int left_child = (2*i) + 1;
        int right_child = (2 * i) + 2;
        if(left_child < array.length && array[parent] > array[left_child]){
            parent = left_child;
        }
        if(right_child < array.length && array[parent] > array[right_child]){
            parent =right_child;
        }
        if(parent != i){
            int temp = array[parent];
            array[parent] = array[i];
            array[i] = temp;
            minHeapify(array, n, parent);
        }
    }

    public void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }


    public static void main(String... strings){
        BuildMinHeap buildMinHeap  = new BuildMinHeap();
        //int[] array = {10,5,20,2,4,8};
        int[] array = {30,20,10};
        buildMinHeap.print(array);
        buildMinHeap.buildMinHeap(array);
        buildMinHeap.print(array);

    }
}
