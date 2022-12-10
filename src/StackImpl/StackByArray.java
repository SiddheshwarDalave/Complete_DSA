package StackImpl;

public class StackByArray {
    int[] stack=new int[10];
    static int top=-1;
    void push(int data){
        top++;
        stack[top]=data;
        return;
    }
    void pop(){
        stack[top]=0;
        top--;
    }
    int peek(){
        return top;
    }
    void print(){
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
}
