package StackImpl;

import java.util.ArrayList;

public class StackByArrayList {
    ArrayList<Integer> arrayList=new ArrayList<>();

    static  int top=-1;

    void push(int data){
        top++;
        arrayList.add(data);
    }
    void pop(){
        arrayList.remove(top);
        top--;
    }
    int peek(){
        return top;
    }
    void print(){
        for(int i=0;i<=top;i++){
            System.out.print(arrayList.get(i)+" ");
        }
        System.out.println();
    }
}
