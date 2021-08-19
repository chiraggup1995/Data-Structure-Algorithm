package Medium;


import BasicOperation.ReverseLL;

public class SegragateOddEven {
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

    public void doSeparate(){
        Node odd_start_node = null;
        Node even_start_node = null;
        Node odd_end_node = null;
        Node even_end_node = null;
        Node temp_node = head;
        //int count = 0;
        while(temp_node != null){
            if(temp_node.value % 2 == 0){
                if(even_start_node == null){
                    even_start_node = temp_node;
                    even_end_node = even_start_node;
                }
                else{
                    even_end_node.next = temp_node;
                    even_end_node = even_end_node.next;
                }
            }
            else{
                if(odd_start_node == null){
                    odd_start_node = temp_node;
                    odd_end_node = odd_start_node;
                }
                else{
                    odd_end_node.next = temp_node;
                    odd_end_node =odd_end_node.next;
                }
            }
            temp_node = temp_node.next;
        }
        head = even_start_node;
        even_end_node.next = odd_start_node;
        odd_end_node.next = null;
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
        SegragateOddEven segragateOddEven = new SegragateOddEven();
        segragateOddEven.insertAtEnd(17);
        segragateOddEven.insertAtEnd(15);
        segragateOddEven.insertAtEnd(8);
        segragateOddEven.insertAtEnd(12);
        segragateOddEven.insertAtEnd(10);
        segragateOddEven.insertAtEnd(5);
        segragateOddEven.insertAtEnd(4);
        segragateOddEven.printLL();
        segragateOddEven.doSeparate();
        segragateOddEven.printLL();

    }
}
