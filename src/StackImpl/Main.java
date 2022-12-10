package StackImpl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Value");
//        StackByArray stackByArray=new StackByArray();
//        stackByArray.push(1);
//        stackByArray.push(2);
//        stackByArray.push(3);
//        stackByArray.push(4);
//        stackByArray.print();
//        stackByArray.pop();
//        stackByArray.print();
//        int peek= stackByArray.peek(); //here taken position
//        System.out.println(peek);

        //for ArrayList
//        StackByArrayList stackByArrayList=new StackByArrayList();
//        stackByArrayList.push(1);
//        stackByArrayList.push(2);
//        stackByArrayList.push(3);
//        stackByArrayList.push(4);
//            stackByArrayList.pop();
//            stackByArrayList.print();

//        StackByLinkedList stackByLinkedList = new StackByLinkedList();
//        stackByLinkedList.push(1);
//        stackByLinkedList.push(2);
//        stackByLinkedList.push(3);
//        stackByLinkedList.push(4);
//        stackByLinkedList.print();
//        stackByLinkedList.pop();
//        stackByLinkedList.print();

        //Stack all Handy Methods
        Stack<Integer> stack =new Stack<>();

        //push
        for(int i=0;i<11;i++){
            stack.push(i);
        }
        //pop
        stack.pop();
        //peek
        System.out.println(Integer.valueOf(stack.peek()));
        //clone-make copy
        Object abc=stack.clone();
        System.out.println(abc);

        //clear
      //  stack.clear();

        //contains(obj) and containsAll(collection)
        if(stack.contains(11)){
            System.out.println("is present");
        }else {
            System.out.println("-1");
        }

        //copyToArray
        Integer[] arr=new Integer[12];
        stack.copyInto(arr);
        for(Integer i:arr){
            System.out.print(i+" ");
        }

        //empty()
        System.out.println(stack.empty());

        //search
        System.out.println(stack.search(1));

        //capacity
        System.out.println(stack.capacity());
        //size
        System.out.println(stack.size());
        //elementAtIndex
        System.out.println(stack.elementAt(1));
        //elements() -> getting enumeration of values present in vector
        Enumeration enu= stack.elements();
       while(enu.hasMoreElements()){
           System.out.println(enu.nextElement());
       }

    }
}