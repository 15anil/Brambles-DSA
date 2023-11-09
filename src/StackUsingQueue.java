import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static Queue<Integer> queue1 = new LinkedList<Integer>();
    static  Queue<Integer>queue2 = new LinkedList<Integer>();
    static int curr_size;

    static void push(int x){
        queue2.add(x);
        while (!queue1.isEmpty()){
            queue2.add(queue1.peek());
            queue1.remove();
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }
    public int pop(){
        if (queue1.isEmpty()){
            return -1;
        }
        return queue1.poll();
    }
    public int peek(){
        if (queue1.isEmpty()){
            return -1;
        }
        return queue1.peek();
    }
    public boolean isEmpty(){
        return queue1.isEmpty();
    }
    public void printStack(){
        System.out.println("Elements of the stack is: ");
        for (int element: queue1){
            System.out.println(element + " ");
        }
        System.out.println();
    }

    public void main(String[] args) {
        StackUsingQueue stackUsingQueue = new StackUsingQueue();
        stackUsingQueue.push(1);
        stackUsingQueue.push(3);
        stackUsingQueue.push(3);
        System.out.println("Peek elements: " + stackUsingQueue.peek());
        System.out.println("all elements are: ");
        stackUsingQueue.printStack();
    }
}
