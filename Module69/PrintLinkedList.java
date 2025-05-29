class Node{
     int data;
     Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class PrintLinkedList {
   static Node head;
    // Void print the data 
  static  void print(){
        if (head==null) {
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

   static void printRev(Node head){
        if(head==null){
            return;
        }
        printRev(head.next);
        System.out.print(head.data+" ");
    }
    
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);

        head=a;
        a.next=b;
        b.next=c;
        c.next=d;

        print();
        printRev(head);
    }
}
