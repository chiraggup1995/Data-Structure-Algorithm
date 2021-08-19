package Medium;


public class PairwiseSwapNodesLL {

   Node head;

    static class Node{
        int value;
        Node next;
        public Node(int data){
            this.value = data;
            this.next = null;
        }
    }


    public void pairwiseSeparate(){
        Node curr_node = head;
        Node next_node = null;
        while(curr_node != null && curr_node.next != null){
            next_node = curr_node.next;
            //Swap the value
            int temp = curr_node.value;
            curr_node.value = next_node.value;
            next_node.value = temp;
            curr_node = next_node.next;
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
        PairwiseSwapNodesLL pairwiseSwapNodesLL = new PairwiseSwapNodesLL();
        pairwiseSwapNodesLL.insertAtEnd(1);
        pairwiseSwapNodesLL.insertAtEnd(2);
        pairwiseSwapNodesLL.insertAtEnd(3);
        pairwiseSwapNodesLL.insertAtEnd(4);
        pairwiseSwapNodesLL.insertAtEnd(5);
        //pairwiseSwapNodesLL.insertAtEnd(6);
       //pairwiseSwapNodesLL.insertAtEnd(7);
        pairwiseSwapNodesLL.printLL();
        pairwiseSwapNodesLL.pairwiseSeparate();
        pairwiseSwapNodesLL.printLL();



    }
}
