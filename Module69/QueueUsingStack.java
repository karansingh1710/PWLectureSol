import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();

    void enQueue(int data){
        stack1.push(data);
        System.out.println(data+" inserted in Queue");
    }

    int dQueue(){
        if(stack1.isEmpty() && stack2.empty()){
            System.out.println("Queue is underflow");
            System.exit(0);
        }

        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }

        int popped= stack2.pop();
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }

        return popped;
    }
    public static void main(String[] args) {
        QueueUsingStack queue=new QueueUsingStack();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(20);
        queue.enQueue(40);
        System.out.println("Queue elements are "+queue.stack1);

        System.out.println(queue.dQueue()+" removed");
        System.out.println(queue.dQueue()+" removed");
        System.out.println(queue.dQueue()+" removed");

        queue.enQueue(10);
        System.out.println("Queue elements are "+queue.stack1);

        System.out.println(queue.dQueue()+" removed");

        queue.enQueue(10);
        queue.enQueue(25);
        System.out.println("Queue elements are "+queue.stack1);

    }
}
