public class InsertBinaryHeap {

    int array[];
    int capacity;
    int size;

    public InsertBinaryHeap(int capacity){
        this.capacity = capacity;
        array = new int[capacity];
        for(int i = 0; i < capacity; i++){
            array[i] = -1;
        }
    }


    //Main Function
    //Insert element into MinHeap
    public void insert(int data){
       // int size = size();
        System.out.println("Size: "+size);
        if(size == capacity) {
            System.out.println("Binary Heap is Full");
            return;
        }
        //Insert New Element in Binary Heap
        array[size] = data;
        int new_index = size; //New Element Index
        size++;
        int parent_index  = (new_index - 1)/2;
        //Maintain the Heapify
        while(new_index != 0 && array[parent_index] > array[new_index]){
            //Swap Parent Index Element with New Index Element
            int temp = array[parent_index];
            array[parent_index] = array[new_index];
            array[new_index] = temp;
            new_index = parent_index;
            parent_index = (new_index - 1)/2;
        }
    }

    //Recursive Function
    public void insertRecursively(int data){
        if(size == capacity) {
            System.out.println("Binary Heap is Full");
            return;
        }
        //Insert New Element in Binary Heap
        array[size] = data;
        int new_index = size; //New Element Index
        size++;
        heapify(new_index);

    }

    private void heapify(int new_index) {
        int parent_index = (new_index -1)/2;
        if(new_index == 0 || array[parent_index] < array[new_index]){
            return;
        }
        //Swap
        int temp = array[parent_index];
        array[parent_index] = array[new_index];
        array[new_index] = temp;

        new_index = parent_index;
        heapify(new_index);
        return;
    }

    public void print(){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }


    public static void main(String... strings){
        InsertBinaryHeap insertBinaryHeap = new InsertBinaryHeap(10);
        insertBinaryHeap.insert(10);
        insertBinaryHeap.print();
        insertBinaryHeap.insert(15);
        insertBinaryHeap.print();
        insertBinaryHeap.insert(20);
        insertBinaryHeap.print();
        insertBinaryHeap.insert(40);
        insertBinaryHeap.print();
        insertBinaryHeap.insert( 50);
        insertBinaryHeap.print();
        insertBinaryHeap.insert( 100);
        insertBinaryHeap.print();
        insertBinaryHeap.insert( 25);
        insertBinaryHeap.print();
        insertBinaryHeap.insert( 45);
        insertBinaryHeap.print();
        insertBinaryHeap.insert( 12);
        insertBinaryHeap.print();
        insertBinaryHeap.insertRecursively( 11);
        insertBinaryHeap.print();
    }
}
