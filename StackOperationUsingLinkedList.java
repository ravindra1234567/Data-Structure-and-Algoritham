import java.util.*;

class Node{
    int data;
    Node next;
}
 class StackOperationUsingLinkedList {

     Node front;

    public Node createNode(int value){
        
        Node node = new Node();
        node.data = value;
        node.next = null;
        return node; 
    }

   

     public void push(int value){
        
        if(front == null){
            front = createNode(value);
            return;
           
        }
        Node node = createNode(value);
        node.next = front;
        front = node;
    }
    public int pop(){
        if(front == null){
            System.out.println("Stack is Empty!");
            return Integer.MIN_VALUE;
        }else{
        int temp = front.data;

        front = front.next;

        return temp;
        }
    }

    public int top(){
        if(front == null){
            System.out.println("Stack is Empty! ");
            return Integer.MIN_VALUE;
        }else{
            return front.data;
        }
    }

    void display(){
        if(front == null){
            System.out.println("Stack is Empty");
        }else{
            Node temp = front;
            while(temp!=null){
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args){

    StackOperationUsingLinkedList obj = new StackOperationUsingLinkedList();
    obj.push(10);
    obj.push(20);
    System.out.println(obj.pop());
    // obj.display();
    System.out.println(obj.top());
    

    }
    
}
