package BasicOperation;

public class DeleteLinkedList {
    Node head;

    static class Node{
        int value;
        Node next;
        public Node(int data){
            this.value = data;
            this.next = null;
        }
    }
    public void insertAtEnd(int new_data){
        Node new_node = new Node(new_data);
        if(head == null){
            head = new_node;
            return;
        }
        Node temp_node = head;
        while(temp_node.next !=null){
            temp_node = temp_node.next;
        }
        temp_node.next = new_node;
    }

    public void deleteFromFront(){
        if(head == null){
            System.out.println("No element to Delete");
        }
        else{
            head = head.next;
        }
    }

    public void deleteFromEnd(){
        if(head == null){
            System.out.println("No element to Delete");
        }
        if(head.next == null){
            head = null;
        }
        Node temp_node = head;
        while(temp_node.next.next != null){
            temp_node = temp_node.next;
        }
        temp_node.next = null;
    }

    public void printLL(){
        if(head == null){
            System.out.println("No Element to delete");
        }
        Node temp_node = head;
        while(temp_node != null){
            System.out.print(temp_node.value + " ");
            temp_node = temp_node.next;
        }
        System.out.println("");
    }

    public static void main(String... strings){
        DeleteLinkedList deleteLinkedList = new DeleteLinkedList();
        deleteLinkedList.insertAtEnd(5);
        deleteLinkedList.insertAtEnd(9);
        //Print LL
        deleteLinkedList.printLL();
        //Insert two more element 4 & 0
        deleteLinkedList.insertAtEnd(2);
        deleteLinkedList.insertAtEnd(0);
        //Print LL
        deleteLinkedList.printLL();
        //Delete First Element
        deleteLinkedList.deleteFromFront();
        //Print LL
        System.out.println("Delete First Element");
        deleteLinkedList.printLL();
        //Delete Last Element
        deleteLinkedList.deleteFromEnd();
        //Print LL
        System.out.println("Delete Last Element");
        deleteLinkedList.printLL();
    }
}
