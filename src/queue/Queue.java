package queue;

public class Queue {

    private Node first;
    private Node last;
    private int length;

    class Node {

        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length=1;

    }

    public void printQueue(){
        Node temp = first;
        while(temp!= null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getFirst(){
        System.out.println("First "+ this.first.value);
    }

    public void getLast(){
        System.out.println("First "+ this.last.value);
    }

    public void getLength(){
        System.out.println("First "+ this.length);
    }

    public void enQueue(int value){
        Node newNode = new Node(value);
        if(first==null){
            first=newNode;
            last=newNode;
        } else {
            last.next = newNode;
            last=newNode;
        }
        length++;
    }

    public Node deQueue(){
        if(length==0) return null;

        Node temp = first;
        if(length==1){
            first=null;
            last=null;
        } else {
            first = first.next;
        }
        temp.next=null;
        length--;

        return temp;
    }

}
