class Queue{
    int front,rear,size;
    int[] q;

    Queue(int size){
        this.size=size;
        this.front=-1;
        this.rear=-1;
        this.q=new int[size];
    }

    void enq(int x){
        if(rear==size-1){
            System.out.println("Queue is full");
            return;
        }else if(front==-1 && rear==-1){
            front=0;rear=0;
            q[rear]=x;
            System.out.println(x+" is added");
        }else{
            q[++rear]=x;
            System.out.println(x+" is added");
        }
    }

    int deq(){
        if(front==-1){
            System.out.println("Queue is underflow no more deque operation");
            return -1;
        }else{
            if (front==rear) {
                int x=q[front];
                front=-1;rear=-1;
                return x;
            }
            else{
                return q[front++];
            }
        }
    }

    void dis(){
        if(front==-1){
            System.out.println("Queue is underflow");
            return;
        }
        for(int i=front; i<=rear; i++){
            System.out.print(q[i]+" ");
        }
        System.out.println();
    }
}
public class QueueImpl {
    public static void main(String[] args) {
        Queue queue=new Queue(5);
        queue.enq(50);
        queue.enq(20);
        queue.enq(30);
        queue.enq(40);
        queue.enq(50);
        queue.enq(60);
        queue.enq(10);
        queue.enq(20);

        queue.dis();

        queue.deq();queue.deq();queue.deq();queue.deq();queue.deq();queue.deq();

        queue.dis();

                queue.enq(20);
            queue.dis();
        
    }
}
