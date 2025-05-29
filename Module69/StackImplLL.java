public class StackImplLL {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static class Stack{
        Node head=null;
        int size;

        void push(int data){
            Node newNode=new Node(data);
            if (head==null){
                 head=newNode;
            }
            else{
                newNode.next=head;
                head=newNode;
            } 
            size++;
             System.out.println(data+" is pushed into stack");
        }

        int pop(){
            if (head==null) {
                System.out.println("Stack is underflow");
                return -1;
            }
            else{
                int popped=head.data;
                head=head.next;
                size--;
                return popped;
            }
        }

        void displayRev(Node h){
            if (h==null) {
                return;
            }
            displayRev(h.next);
            System.out.print(h.data+" ");
        
    }

        void display(){
            displayRev(head);
            System.out.println();
            }
            
        }
    
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(23);
        st.push(33);
        st.push(323);
        System.out.println("Size of the Stack "+st.size);
        st.display();
        st.pop();
        System.out.println("Size of the Stack "+st.size);
        st.display();
        
    }
}
