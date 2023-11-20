package stacks;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
   static Queue<Integer> queue1 = new LinkedList<>();
   static Queue<Integer> queue2 = new LinkedList<>();
   static int curr_size;
   public static void push(int data){
      queue2.add(data);
      while (!queue1.isEmpty()){
         queue2.add(queue1.remove());
      }
      //swap the names of the queues
      Queue<Integer> queue = queue1;
      queue1 = queue2;
      queue2 = queue;
   }
   public static void pop(){
      if (queue1.isEmpty())
         return;
      queue1.remove();
   }
   public static int peek(){
      if (queue1.isEmpty())
         return -1;
      return queue1.peek();
   }
   public static int size(){
      return queue1.size();
   }
   public static void main(String[] args) {
      StackUsingQueue stackUsingQueue = new StackUsingQueue();
      stackUsingQueue.push(1);
      stackUsingQueue.push(2);
      stackUsingQueue.peek();
      System.out.println("current size is: " + stackUsingQueue.size());
   }
}
