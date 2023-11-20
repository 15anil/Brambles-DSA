package stacks;

public class DStack {
    int capacity = 2;
    int stack[] = new int[capacity];
    int top = 0;
    public void push(int data){
        if (size() == capacity)
            expand();
        stack[top] = data;
        top++;
    }

    private void expand() {
        int length = size();
        int newStack[] = new int[capacity * 2];
        System.arraycopy(stack,0,newStack,0,length);
        stack = newStack;
        capacity *= 2;
    }

    public int size(){
        return top;
    }
    public void show(){
        for(int show:stack){
            System.out.print(show + " ");
        }
        System.out.println();
    }
}
