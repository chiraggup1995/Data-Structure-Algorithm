package Medium;

public class RemoveLoopLL {
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

    public void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node slow_pointer = head;
        Node fast_pointer = head;
        boolean loop_exist = false;
        while(fast_pointer != null && fast_pointer.next != null){
            slow_pointer = slow_pointer.next;
            fast_pointer = fast_pointer.next.next;
            if(slow_pointer == fast_pointer){
                loop_exist = true;
                break;
            }
        }
        if(loop_exist == false){
            return;
        }

        //Case 1 if root node is loop only
        //Find start point
        fast_pointer = head;
        Node prev_node = null;
        if(slow_pointer == fast_pointer){
            slow_pointer = slow_pointer.next;
            while(slow_pointer != fast_pointer){
                prev_node = slow_pointer;
                slow_pointer = slow_pointer.next;
            }
            prev_node.next = null;
        }
        else {
            while (slow_pointer != fast_pointer) {
                prev_node = slow_pointer;
                fast_pointer = fast_pointer.next;
                slow_pointer = slow_pointer.next;
            }
            if (prev_node == null) {
                slow_pointer.next = null;
            } else {
                prev_node.next = null;
            }
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
        RemoveLoopLL list = new RemoveLoopLL();
        list.head = new Node(7);
        list.head.next = new Node(58);
        list.head.next.next = new Node(36);
        list.head.next.next.next = new Node(34);
        list.head.next.next.next.next = new Node(16);
        list.head.next.next.next.next.next = list.head.next.next.next.next;
        list.removeLoop(list.head);
        list.printLL();
    }
}
