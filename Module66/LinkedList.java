package Module66;
class Node{
    Node next;
    int data;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class LinkedList {
    Node head;

    // Implementation of addInFirst() method
    public void addInFirst(int data){
        Node newNode=new Node(data);
        if (head==null) {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        
    }

    // Implementation of addInLast() method
    public void addInLast(int data){
        Node newNode=new Node(data);
        Node temp=head;
        if(head==null){
            head=newNode;
            return;
        }
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
    }

    // Add in middle
    void addInMiddle(int idx, int data){
        Node temp=head;
        Node newNode=new Node(data);
        if(idx==1) {
            newNode.next=head;
            head=newNode;
            return;
        }
        if(idx<=0){
            System.out.println("Insertion not possible. Index is out of range.");
            return;
        }
        int count=1;
        while(temp!=null && count<idx-1){
            temp=temp.next;
            count++;
        }
        if(temp==null){
            System.out.print("Insertion can't possible index is out of range");
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }

    // Method to delete first node from the linked list
    void delInFirst(){
        if(head==null){
            System.out.println("Deletion is not possible. LinkedList is empty");
            return;
        }
        head=head.next;
    }

    // Method to delete last node from the linked list
    void delInLast(){
        if(head==null){
            System.out.println("Deletion is not possible. LinkedList is empty");
            return;
        }
        Node temp=head;
        while (temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
    }

    // Method to delete node in between the linked list
    void delFromMiddle(int idx){

    }

    // Method to print linked list
     void printList(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    // Implementation of reversal of linkedlist
    public void reverse(){
        Node curr=head;
        Node nextNode=null;
        Node prev=null;

        while (curr!=null) {
            nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        head=prev;
    }
    // Implementation of reverse linkedlist using recursion
    public void  rev(Node curr,Node nextNode,Node prev){
        if(curr==null){
            head=prev;
            return;
        }
        nextNode=curr.next;
        curr.next=prev;
        prev=curr;
        curr=nextNode;
        rev(curr,nextNode,prev);
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        // ll.addInFirst(10);
        // ll.printList();
        // ll.addInFirst(20);
        // ll.printList();
        // ll.addInLast(23);
        // ll.printList();
        // ll.addInLast(25);
        // ll.printList();
        // ll.addInMiddle(1, 11);
        // ll.printList();
        // ll.addInMiddle(-1, 55);
        // ll.printList();

        // ll.delInFirst();
        // ll.printList();

        // ll.delInLast();
        // ll.printList();

        ll.addInFirst(10);
        ll.addInLast(20);
        ll.addInLast(30);
        ll.addInLast(40);
        ll.addInLast(50);
        System.out.println("Original Linkedlist");
        ll.printList();
        // ll.reverse();
        ll.rev(ll.head, null, null);
        System.out.println("Reversed Linkedlist");
        ll.printList();
        
    }
}
