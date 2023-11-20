package linkedLists;

import javax.management.NotificationEmitter;

public class LinkedLists {
    Node head;
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null){
            head = node;
        }
        else {
            Node n = head;
            while (n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void show(){
        Node node1 = head;
        while (node1.next!=null){
            System.out.println(node1.data);
            node1 = node1.next;
        }
        System.out.println(node1.data);
    }
    public void insertAtFirst(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;

    }
    public void insertAtAny(int index,int data){
        if(index == 0){
            insertAtFirst(data );
        }
        else {
            Node node = new Node();
            node.data = data;
            node.next = null;
            Node n = head;
            for (int i=0;i<index-1;i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    public void deleteAt(int index){
        if (index == 0){
            head = head.next;
        }
        else {
            Node n = head;
            Node temp = null;
            for(int i=0;i<index-1;i++){
                n = n.next;
            }
            temp = n.next;
            n.next = temp.next;
            temp = null;
        }
    }
    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public void findMiddle(){
        Node fast = head;
        Node slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("middle element of a linked list is " + slow.data);
    }
}
