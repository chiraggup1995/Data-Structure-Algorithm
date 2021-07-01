public class DeleteElement {

    //Main Function
    //Delete Element at given Index
    public void deleteElement(int[] array, int n, int i) {
        if (i < n) {
            //Swap with Last Element
            int temp = array[i];
            array[i] = array[n - 1];
            array[n - 1] = temp;
            minHeapify(array, array.length,i);
        }
    }

        public void minHeapify(int[] array, int n, int i) {
            int parent = i;
            int temp_parent = parent;
            int left_child = 2 * parent + 1;
            int right_child = 2 * parent + 2;

            if (left_child < n && array[parent] > array[left_child]) {
                parent = left_child;
            }
            if (right_child < n && array[parent] > array[right_child]) {
                parent = right_child;
            }
            if (parent != i) {
                int temp = array[temp_parent];
                array[temp_parent] = array[parent];
                array[parent] = temp;
                minHeapify(array, n, i);
            }
        }

    public void print(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }


    public static void main(String... strings) {
        DeleteElement deleteElement = new DeleteElement();
        int[] array = {10, 30, 20, 40, 50, 35, 38, 45};
        deleteElement.print(array, array.length);
        deleteElement.deleteElement(array, array.length, 1);
        deleteElement.print(array, array.length-1);
    }
}
