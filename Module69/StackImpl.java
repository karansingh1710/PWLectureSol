import java.util.Scanner;

class Stack{
    private int[] stack;
    private int top,size;
    Stack(int size){
        this.size=size;
        this.top=-1;
        stack=new int[size];
    }

    // push()
    void push(int x){
        if(top==n-1){
            System.out.println("Stack is full");
            return;
        }
        
        stack[++top]=x;
        System.out.format("%d is pushed in stack.%n",x);
    }
    // pop()
    int pop(){
        if(top==-1){
            System.out.println("Stack is underflow.");
            return -1;
        }
        
        return stack[top--];
    }
    // peek()
    int peek(){
        if(top==-1){
            System.out.println("Stack is underflow.");
            return -1;
        }
        return stack[top];
    }
    // search()
    int search(int target){
        int idx=-1;
        for(int i=top; i>=0; i--){
            if(stack[i]==target){
                idx=i;
                break;
            }
        }

        return idx!=-1?top-idx:idx;
    }
    // size
    int size(){
        return top+1;
    }
    // isEmpty()
    boolean isEmpty(){
        return size==0;
    }
}
public class StackImpl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
    }
}
