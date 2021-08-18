package BasicOperation;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesLL {
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

    public Node removeDuplicates()
    {
        // Your code here
        Set<Integer> hashset = new HashSet<Integer>();
        Node temp_node = head;
        Node prev_node = null;
        while(temp_node != null){
            if(hashset.contains(temp_node.value)){
                prev_node.next = temp_node.next;
            }
            else{
                hashset.add(temp_node.value);
                prev_node = temp_node;
            }
            temp_node = temp_node.next;
        }
        return head;
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
        RemoveDuplicatesLL removeDuplicatesLL = new RemoveDuplicatesLL();
        removeDuplicatesLL.insertAtEnd(5);
        removeDuplicatesLL.insertAtEnd(2);
        removeDuplicatesLL.insertAtEnd(2);
        removeDuplicatesLL.insertAtEnd(4);
        removeDuplicatesLL.insertAtEnd(5);
        removeDuplicatesLL.insertAtEnd(6);
        removeDuplicatesLL.insertAtEnd(6);
        removeDuplicatesLL.printLL();
        Node head = removeDuplicatesLL.removeDuplicates();
        removeDuplicatesLL.printLL();
    }
}
