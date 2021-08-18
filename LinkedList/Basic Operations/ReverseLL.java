package BasicOperation;

public class ReverseLL {

    Node head;

    static class Node{
        int value;
        Node next;
        public Node(int data){
            this.value = data;
            this.next = null;
        }
    }

    //Normal Insertation at the End
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

    //Main Function
    //Reverse Linked List
    public Node reverseLL(Node node){
        Node current_node = head;
        if(current_node == null){
            System.out.println("No element to reverse");
            return node;
        }
        Node prev_node =null;
        Node next_node = null;

        while(current_node != null){

            next_node = current_node.next;
            current_node.next = prev_node;
            prev_node = current_node;
            current_node =next_node;
        }
        node = prev_node;
        return node;
    }

    //Print LL
    public void printLL(Node head){
        if(head == null){
            System.out.println("No Element to print");
            return;
        }
        Node temp_node = head;
        while(temp_node != null){
            System.out.print(temp_node.value + " ");
            temp_node = temp_node.next;
        }
        System.out.println("");
    }

    public static void main(String... strings){
        ReverseLL reverseLL =new ReverseLL();
        reverseLL.insertAtEnd(2);
        reverseLL.insertAtEnd(3);
        reverseLL.insertAtEnd(4);
        reverseLL.insertAtEnd(5);
        //Print LL
        reverseLL.printLL(reverseLL.head);
        //Reverse LL
        Node head = reverseLL.reverseLL(reverseLL.head);
        //Print LL
        reverseLL.printLL(head);

    }
}
