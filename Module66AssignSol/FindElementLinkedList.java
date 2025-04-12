class Node{
    Node next;
    int data;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class FindElementLinkedList {
    Node head;
    void add(int data){
        Node newNode=new Node(data);
        if (head==null) {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    boolean findTarget(int key){
        Node temp=head;
        while (temp!=null) {
            if(temp.data==key) return true;
            temp=temp.next;
        }
        return false;
    }
   public static void main(String[] args) {
        FindElementLinkedList ll=new FindElementLinkedList();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(44);
        ll.display();

        System.out.println(ll.findTarget(50));
   } 
}