import java.util.ArrayList;
import java.util.Arrays;

public class SinglyLinkedList {
    public Node head; //node is the pointer

    // constructor
    public SinglyLinkedList() {
        this.head = null; 
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(this.head == null) { //head is a pointer
            this.head = newNode;
        } else {
            Node runner = this.head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    // remove method
    public void remove(){
        Node runner = head;
        Node previous = head;
        while(runner != null){
            if (runner.next == null){
                previous.next = null;
            }
        previous = runner;
        runner = runner.next;
        }
    }    

    // print all values method
    public void printValues(){
        Node runner = head;
        while(runner != null){ //iterate through end of list
            System.out.println(runner.value);
            runner = runner.next;
        }
    }
}