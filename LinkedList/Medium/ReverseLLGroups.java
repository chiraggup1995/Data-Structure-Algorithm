package Medium;

import BasicOperation.MiddleElementLL;

public class ReverseLLGroups {
    Node head;

    class Node{
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

//    public void reverseGroups(int d){
//        if(head == null || d==1){
//            System.out.println("No Node to reverse");
//            return;
//        }
//        Node first = head;
//        Node last = null;
//        Node temp_node = head;
//        int count =1;
//        while(temp_node != null){
//            //First find the last node of the group
//            while(temp_node.next != null && count != d){
//                temp_node = temp_node.next;
//                count++;
//            }
//            //Assign Last node of the group to Last Node
//            last = temp_node;
//            int i = 1;
//            //Reverse the group Node
//            while( i < count){
//                int temp_value = first.value;
//                first.value = last.value;
//                last.value = temp_value;
//                i++;
//                count--;
//            }
//
//            //
//            first = temp_node.next;
//            temp_node = temp_node.next;
//            count = 1;
//
//        }
//    }


    public Node reverseGroups(Node head, int k){
        Node curr_node =  head;
        Node next = null;
        Node prev = null;
        int count = 0;
        while(curr_node != null && count != k){
            next = curr_node.next;
            curr_node.next = prev;
            prev = curr_node;
            curr_node = next;
            count++;
        }
        if(next != null){
            Node link_node = reverseGroups(next, k);
            head.next = link_node;
        }
        return prev;
    }
    //Print LL
    public void printLL(Node new_head){
        if(new_head == null){
            System.out.println("No Element to print");
            return;
        }
        Node temp_node = new_head;
        while(temp_node != null){
            System.out.print(temp_node.value + " ");
            temp_node = temp_node.next;
        }
        System.out.println("");
    }

    public static void main(String... strings){
        ReverseLLGroups reverseLLGroups = new ReverseLLGroups();
        reverseLLGroups.insertAtEnd(1);
        reverseLLGroups.insertAtEnd(2);
        reverseLLGroups.insertAtEnd(3);
        reverseLLGroups.insertAtEnd(4);
        reverseLLGroups.insertAtEnd(5);
        reverseLLGroups.insertAtEnd(6);
        reverseLLGroups.insertAtEnd(7);
        reverseLLGroups.insertAtEnd(8);
        reverseLLGroups.printLL(reverseLLGroups.head);
        System.out.println("After Rotation");
        Node new_head = reverseLLGroups.reverseGroups(reverseLLGroups.head, 3 );
        reverseLLGroups.printLL(new_head);

    }
}
