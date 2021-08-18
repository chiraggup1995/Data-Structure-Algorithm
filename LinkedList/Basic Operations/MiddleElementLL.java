package BasicOperation;

public class MiddleElementLL {
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
    //Middle Element of the Linked List
    public void middleElement(){
        Node temp_node = head;
        if(temp_node == null){
            System.out.println("No Element Present in the LL");
            return;
        }
        int middle_index = 0;
        while(temp_node != null){
            middle_index++;
            temp_node = temp_node.next;
        }
        middle_index = middle_index/2 + 1;
        Node middle_node = head;
        int index = 0;
        while(middle_node != null){
            index++;
            if(middle_index == index){
                System.out.println("Middle Element: " +middle_node.value);
                return;
            }
            middle_node = middle_node.next;
        }
    }

    //Efficient Middle Element of the LL
    public void middleElementLL() {
        Node slow_temp_node = head;
        Node fast_temp_node = head;

        if (slow_temp_node == null) {
            System.out.println("No Element Present in the LL");
            return;
        }
        while (fast_temp_node != null) {
            if (fast_temp_node.next == null) {
                break;
            }
            slow_temp_node = slow_temp_node.next;
            fast_temp_node = fast_temp_node.next.next;
        }

        System.out.println("Middle Element: " + slow_temp_node.value);
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
        MiddleElementLL middleElementLL = new MiddleElementLL();
        middleElementLL.insertAtEnd(4);
        middleElementLL.insertAtEnd(2);
        middleElementLL.insertAtEnd(5);
        middleElementLL.insertAtEnd(98);
        middleElementLL.insertAtEnd(10);
        middleElementLL.insertAtEnd(28);
        //Print LL
        middleElementLL.printLL();
        //Find Middle Element
        middleElementLL.middleElement();
        //Find Middle Element
        middleElementLL.middleElementLL();

    }

}
