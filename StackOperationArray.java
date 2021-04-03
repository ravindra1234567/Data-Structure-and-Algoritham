import java.util.*;
public class StackOperationArray{

    static int top =0;
    static int max = 5;
    static int[] stack = new  int[5];

    static boolean isFull(){
        if(top==max)
            return true;
        return false;
    }
    static boolean isEmpty(){
        if(top == 0)
            return true;
        return false;
    }
    static int top(){
        if(isEmpty()){
            System.out.println("Stack Is Empty");
            return Integer.MIN_VALUE;
        }else{
            return stack[top-1];
        }

    }

    static void insert(int a){
        if(isFull()){
            System.out.println("Stacj is Full");
        }else{
            stack[top++] = a;
        }
        
    }
    static int remove(){
        if(isEmpty()){
            System.out.println("Stack Is Empty");
            return Integer.MIN_VALUE;
        }else{
            return stack[--top];
        }

    }

    public static void main(String[] args){
        insert(10);
        insert(12);
        insert(13);
        insert(14);
        insert(15);
        // insert(16);
        System.out.println("Remove = " + remove());
       System.out.println("Top = " + top());
      
    }
}