package Medium;


class Node1{
    int value;
    Node1 next;
    public Node1(int data){
        this.value = data;
        this.next = null;
    }
}

class MergeLL{
    //Normal Insertation at the End
    public Node1 insertAtEnd(int new_data, Node1 head){
        Node1 new_node = new Node1(new_data);
        if(head == null){
            head = new_node;
            return head;
        }
        Node1 temp_node = head;
        while(temp_node.next !=null){
            temp_node = temp_node.next;
        }
        temp_node.next = new_node;
        return head;
    }

    //Merge Two Sorted LL
    public Node1 mergeLL(Node1 head1, Node1 head2){
        Node1 curr1 = head1;
        Node1 curr2 = head2;
        Node1 prev1 = null;
        Node1 prev2 = null;
        boolean curr_first_list ;
        if(head1.value < head2.value){
            curr_first_list = true;
        }else{
            curr_first_list = false;
        }
        while(curr1 != null && curr2 != null){
            if(curr1.value > curr2.value){
                if(curr_first_list == true){
                    prev1.next = curr2;
                    curr_first_list = false;

                }
                prev2 = curr2;
                curr2 = curr2.next;
            }
            else{
                if(curr_first_list == false){
                    prev2.next = curr1;
                    curr_first_list = true;
                }
                prev1 = curr1;
                curr1 = curr1.next;
            }
        }
        if(curr_first_list == false && curr1 != null){
            prev2.next = curr1;
        }
        else if(curr_first_list == true && curr2 != null){
            prev1.next = curr2;
        }

        if(head1.value < head2.value){
            return head1;
        }else{
            return head2;
        }


    }

    //Print LL
    public void printLL(Node1 head){
        if(head == null){
            System.out.println("No Element to print");
            return;
        }
        Node1 temp_node = head;
        while(temp_node != null){
            System.out.print(temp_node.value + " ");
            temp_node = temp_node.next;
        }
        System.out.println("");
    }

}
public class MergeTwoSortedLL {
    public static void main(String... strings) {
        MergeLL mergeLL = new MergeLL();

        Node1 head1 = new Node1(1);
        head1 = mergeLL.insertAtEnd(20, head1);
        head1 = mergeLL.insertAtEnd(30, head1);
        head1 = mergeLL.insertAtEnd(40, head1);
        mergeLL.printLL(head1);

        Node1 head2 = new Node1(5);
        head2 = mergeLL.insertAtEnd(15, head2);
        head2 = mergeLL.insertAtEnd(25, head2);
        head2 = mergeLL.insertAtEnd(35, head2);
        head2 = mergeLL.insertAtEnd(55, head2);
        head2 = mergeLL.insertAtEnd(65, head2);
        head2 = mergeLL.insertAtEnd(75, head2);
        mergeLL.printLL(head2);

        Node1 head = mergeLL.mergeLL(head1, head2);
        mergeLL.printLL(head);
    }

}
