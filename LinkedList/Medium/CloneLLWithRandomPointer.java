package Medium;

class  Node {
    int value;
    Node next;
    Node random;

    public Node(int data) {
        this.value = data;
        this.next = null;
        this.random = null;
    }
}

class CloneLinkedList {
    Node head;

    public CloneLinkedList(Node head) {
        this.head = head;
    }

    //Normal Insertation at the End
    public void insertAtFront(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = this.head;
        this.head = new_node;
    }

    public void cloneLL(){

    }

    //Print LL
    public void printLL(){
        Node temp_node = head;
        while(temp_node != null){
            System.out.print(temp_node.value + " ");
            temp_node = temp_node.next;
        }
        System.out.println("");
    }

    public void print(){
        Node temp = head;
        if(temp == null){
            System.out.println("No Element Present");
        }
        while(temp != null){
                System.out.println("Data : " +temp.value+ " Random : "+temp.random.value);
                temp = temp.next;
        }
    }
}

public class CloneLLWithRandomPointer{

    public static void main(String... strings){
        CloneLinkedList cloneLinkedList = new
                CloneLinkedList(new Node(10));
        cloneLinkedList.insertAtFront(5);
        cloneLinkedList.insertAtFront(20);
        cloneLinkedList.insertAtFront(15);
        cloneLinkedList.insertAtFront(30);
        cloneLinkedList.printLL();
        System.out.println(" ");
        cloneLinkedList.head.random = cloneLinkedList.head.next.next;
        cloneLinkedList.head.next.random = cloneLinkedList.head.next.next.next;
        cloneLinkedList.head.next.next.random = cloneLinkedList.head;
        cloneLinkedList.head.next.next.next.random = cloneLinkedList.head.next.next;
        cloneLinkedList.head.next.next.next.next.random = cloneLinkedList.head.next.next.next;

        //Print
        cloneLinkedList.print();


    }
}
