package BasicOperation;

public class InsertSortedElement {
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

    //MAIN FUNCTION
    //INSERTED ELEMENT IN SORTED ORDER
    public void insertSortedElement(int new_data){
        Node new_node = new Node(new_data);
        if(head == null){
            head = new_node;
        }
        Node temp_node = head;
        if(temp_node.next == null){
            if(temp_node.value > new_data){
                System.out.println("Reached Here");
                new_node.next = head;
                head = new_node;
                return;
            }
        }
        while(temp_node.next != null){
            if(temp_node.value > new_data){
                //System.out.println("Temp Node "+temp_node.value);
                new_node.next =head;
                head = new_node;
                return;
            }
            if(temp_node.value <= new_data && temp_node.next.value > new_data){
                new_node.next = temp_node.next;
                temp_node.next = new_node;
                return;
            }
            temp_node = temp_node.next;
        }

        temp_node.next = new_node;
        return;
    }

    //Print LL
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
        InsertSortedElement insertSortedElement = new InsertSortedElement();
        insertSortedElement.insertAtEnd(4);
        insertSortedElement.insertAtEnd(5);
        insertSortedElement.insertAtEnd(6);
        insertSortedElement.insertAtEnd(7);
        //Print LL
        insertSortedElement.printLL();
        //Insert sorted element at first
        insertSortedElement.insertSortedElement(2);
        //Print LL
        insertSortedElement.printLL();
        //Insert sorted element in middle
        insertSortedElement.insertSortedElement(3);
        //Print LL
        insertSortedElement.printLL();
        //Insert sorted element at last
        insertSortedElement.insertSortedElement(9);
        //Print LL
        insertSortedElement.printLL();
    }

}
