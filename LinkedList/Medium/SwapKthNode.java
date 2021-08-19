package Medium;


//Swap Kth Node from Beginning with the Kth Node from the




public class SwapKthNode {
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


    //Swap
    public void swap(int K){
        //First count the number of elements in the LL
        Node temp_node = head;
        int count  = 0;
        while(temp_node != null){
            temp_node = temp_node.next;
            count++;
        }
        //If the K is larger than the Number of elements
        if(K > count){
            return;
        }

        //If the Kth element from the beginning is same as Kth Last Element
        if((2 * K) -1 == count){
            return;
        }

        //Find the Front Current & previous Node
        Node prev = null;
        Node curr = head;
        for(int i = 1; i < K; i++){
            prev = curr;
            curr = curr.next;
        }


        //Find the kth node from the back and its previous node
        Node back_prev = null;
        Node back_curr = head;
        for(int i = 1; i < count - K +1; i++){
            back_prev = back_curr;
            back_curr = back_curr.next;
        }

        //If Prev is not null
        if(prev != null){
            prev.next = back_curr;
        }

        //If Back Prev is not null
        if(back_prev != null){
            back_prev.next = curr;
        }

        Node temp = back_curr.next;
        back_curr.next = curr.next;
        curr.next = temp;

        if(K==1){
            head = back_curr;
        }
        if(K == count){
            head = curr;
        }

    }

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
        SwapKthNode swapKthNode = new SwapKthNode();
        swapKthNode.insertAtEnd(1);
        swapKthNode.insertAtEnd(2);
        swapKthNode.insertAtEnd(3);
        swapKthNode.insertAtEnd(4);
        swapKthNode.insertAtEnd(5);
        swapKthNode.insertAtEnd(6);
        swapKthNode.insertAtEnd(7);
        swapKthNode.insertAtEnd(8);
        swapKthNode.printLL();

        for(int i = 1; i < 9; i++){
            swapKthNode.swap(i);
            System.out.println("Modified List for Kth = " +i);
            swapKthNode.printLL();
        }
    }
}
