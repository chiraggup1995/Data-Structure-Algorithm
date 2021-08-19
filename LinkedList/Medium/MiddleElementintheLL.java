package Medium;


public class MiddleElementintheLL {
    Node head;
    class Node{
        int value;
        Node next;
        public Node(int data){
            this.value = data;
            this.next = null;
        }
    }

    public void insertAtEnd(int value){
        Node new_node = new Node(value);
        if(head == null){
            head = new_node;
        }else{
            Node temp_node = head;
            while(temp_node.next != null){
                temp_node = temp_node.next;
            }
            temp_node.next = new_node;
        }
    }

    //Middle Element of the Linked List
    public void middleElement(){
        if(head== null){
            System.out.println("No Middle Element");
            return;
        }
        Node slow_pointer = head;
        Node fast_pointer = head;

        while(fast_pointer.next != null && fast_pointer.next.next != null){
            slow_pointer = slow_pointer.next;
            fast_pointer = fast_pointer.next.next;
        }
        if(fast_pointer.next == null){
            System.out.println("Middle Element " + slow_pointer.value);
        }else{
            System.out.println("Middle Element " +slow_pointer.next.value);
        }
        return;
    }

    public void print(){
        if(head == null){
            System.out.println("No Element in LL");
        }
        else{
            Node temp_node = head;
            while(temp_node != null){
                System.out.println(temp_node.value);
                temp_node = temp_node.next;
            }
        }
    }

    public static void main(String... strings){
        MiddleElementintheLL middleElementLinkedList = new MiddleElementintheLL();
        middleElementLinkedList.print();
        middleElementLinkedList.insertAtEnd(4);
        middleElementLinkedList.middleElement();
        middleElementLinkedList.insertAtEnd(2);
        middleElementLinkedList.middleElement();
        middleElementLinkedList.insertAtEnd(5);
        middleElementLinkedList.insertAtEnd(98);
        middleElementLinkedList.insertAtEnd(10);
        middleElementLinkedList.middleElement();
        middleElementLinkedList.insertAtEnd(28);
        middleElementLinkedList.middleElement();
        //middleElementLinkedList.print();
    }
}
