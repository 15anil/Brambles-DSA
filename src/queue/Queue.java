package queue;

public class Queue {
    int queue[] = new int[5];
    int size;
    int front;
    int rear;
    public void enQueue(int data){
        if(isFull()){
            System.out.println("queue is full: ");
        }
        else {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size++;
        }
    }
    public void show(){
        System.out.println("the elements: ");
        for (int i=0;i<size;i++){
            System.out.println(queue[(front+i)%5]+ " ");
        }
    }
    public int dequeue(){
        if (isEmpty()){
            System.out.println("queue is empty: ");
        }
        else {

        }
        int data = queue[front];
        front = (front + 1) % 5;
        size = size -1;
        return data;

    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == 5;
    }

}
