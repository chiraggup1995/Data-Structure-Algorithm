package BasicOperation;

public class RemoveDuplicatesSortedLL {
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
    //Delete Duplicates Nodes from Sorted LL
//    public void removeDuplicates(){
//        if(head == null){
//            System.out.println("No Element to Delete");
//            return;
//        }
//        Node current_node = head;
//        while(current_node != null){
//            Node tmp_node = current_node.next;
//            while(tmp_node != null && tmp_node.value == current_node.value){
//                tmp_node = tmp_node.next;
//            }
//            current_node.next = tmp_node;
//            current_node = current_node.next;
//        }
//    }

    public void removeDuplicates(){
        if(head == null){
            System.out.println("No Element to Delete");
          return;
        }
        Node current_node = head;
        while(current_node !=  null &&  current_node.next != null){
            if(current_node.value == current_node.next.value){
                current_node.next = current_node.next.next;
            }
            else{
                current_node = current_node.next;
            }
        }
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
        RemoveDuplicatesSortedLL removeDuplicatesSortedLL = new RemoveDuplicatesSortedLL();
        removeDuplicatesSortedLL.insertAtEnd(10);
        removeDuplicatesSortedLL.insertAtEnd(20);
        removeDuplicatesSortedLL.insertAtEnd(20);
        removeDuplicatesSortedLL.insertAtEnd(30);
        removeDuplicatesSortedLL.insertAtEnd(30);
        removeDuplicatesSortedLL.insertAtEnd(30);
        removeDuplicatesSortedLL.insertAtEnd(40);

        //Print LL
        removeDuplicatesSortedLL.printLL(removeDuplicatesSortedLL.head);

        //Call Remove Duplicates Function
        removeDuplicatesSortedLL.removeDuplicates();

        //print LL
        removeDuplicatesSortedLL.printLL(removeDuplicatesSortedLL.head);


    }

}
