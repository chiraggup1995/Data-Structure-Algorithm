public class DecreaseKey {


    //Main Function
    //Decrease The key value and maintain Min Heap
    //i = index,  x = data to be replaced
    public void decreaseKey(int[] array, int x, int i) {
        if (i < array.length) {
            array[i] = x;
            minHeapify(array, array.length, i);
        }
    }

    public void minHeapify(int[] array, int n, int i) {
        if (i == 0) {
            return;
        }
        int parent = (i - 1) / 2;
        int temp_parent = parent;
        int left_child = 2 * parent + 1;
        int right_child = 2 * parent + 2;

        if (left_child < n && array[parent] > array[left_child]) {
            parent = left_child;
        }
        if (right_child < n && array[parent] > array[right_child]) {
            parent = right_child;
        }
        if (parent != temp_parent) {
            int temp = array[temp_parent];
            array[temp_parent] = array[parent];
            array[parent] = temp;
            minHeapify(array, n, temp_parent);
        }
    }

    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String... strings) {
        DecreaseKey decreaseKey = new DecreaseKey();
        int[] array = {20, 80, 200, 90, 100, 250, 500, 120, 130, 110};
        decreaseKey.print(array);
        decreaseKey.decreaseKey(array, 10, 1);
        decreaseKey.print(array);
    }
}
