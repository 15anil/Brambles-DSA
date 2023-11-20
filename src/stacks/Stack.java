package stacks;

public class Stack {
    int stack[] = new int[5];
    int top = 0;
     public void push(int data){
         stack[top] = data;
         top++;
     }
     public int pop(){
         int data;
         top--;
         data = stack[top];
         stack[top] = 0;
         return data;
     }
     public void show(){
         for (int n: stack){
             System.out.println( n + " ");
         }
     }
     public int peek(){
        if (top == 0){
            System.out.println("stack is empty: ");
            return -1;
        }
        else {
            System.out.println("top element of stack is: " + stack[top-1]);
            return stack[top-1];
        }
     }
}
