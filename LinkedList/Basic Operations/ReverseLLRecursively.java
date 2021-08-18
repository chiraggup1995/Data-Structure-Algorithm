package BasicOperation;

public class ReverseLLRecursively {

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
    //Reverse the Linked List Recursively
    public void reverseRecursively(Node current_node, Node prev_node){
        if(head == null){
            return;
        }
        if(current_node == null){
            head = prev_node;
            return;
        }
        reverseRecursively(current_node.next, current_node);
        current_node.next = prev_node;
        return;
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
        ReverseLLRecursively reverseLLRecursively = new ReverseLLRecursively();
        reverseLLRecursively.insertAtEnd(2);
        //reverseLLRecursively.insertAtEnd(3);
        //reverseLLRecursively.insertAtEnd(4);
        //reverseLLRecursively.insertAtEnd(5);

        //Print LL
        reverseLLRecursively.printLL(reverseLLRecursively.head);
        //Reverse LL
        reverseLLRecursively.reverseRecursively(reverseLLRecursively.head, null);

        //Print LL
        reverseLLRecursively.printLL(reverseLLRecursively.head);
    }
}
