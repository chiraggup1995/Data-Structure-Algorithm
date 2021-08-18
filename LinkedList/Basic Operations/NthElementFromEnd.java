package BasicOperation;

public class NthElementFromEnd {
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
    //Find Nth Element from the End
    public void nthElement(int x){
        Node temp_node1 = head;
        Node temp_node2 = head;
        if(x < 1){
            System.out.println("Please X value greater than 1");
            return;
        }
        for(int i =1; i <= x; i++){
            if(temp_node1 == null){
                System.out.println("Element is not present");
                return;
            }
            temp_node1 = temp_node1.next;
        }
        while(temp_node1 != null){
            temp_node1 = temp_node1.next;
            temp_node2 = temp_node2.next;
        }
        System.out.println("Nth ("+x+") Element from the Last is "+temp_node2.value);
    }


    //Print LL
    public void printLL(){
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
        NthElementFromEnd nthElementFromEnd = new NthElementFromEnd();
        nthElementFromEnd.insertAtEnd(4);
        nthElementFromEnd.insertAtEnd(2);
        nthElementFromEnd.insertAtEnd(3);
        nthElementFromEnd.insertAtEnd(5);
        nthElementFromEnd.insertAtEnd(9);
        //Print LL
        nthElementFromEnd.printLL();
        //Find Nth node from End
        nthElementFromEnd.nthElement(3);



    }
}
