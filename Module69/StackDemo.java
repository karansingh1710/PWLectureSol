import java.util.Stack;
public class StackDemo {
    public static void main(String[] args){
        Stack<Integer> stack1=new Stack<>();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);

        System.out.println(stack1);
        System.out.println(stack1.peek());
        System.out.println(stack1.size());
        System.out.println(stack1.remove(1));
        stack1.add(20);
        System.out.println(stack1);
        System.out.println(stack1.peek());

        System.out.println(stack1.search(2));
    }
}
