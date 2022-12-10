package StackImpl;

public class StackByLinkedList {

    static int top=-1;
    StackClass head;

    void push(int data){
        StackClass new_stackClass =new StackClass(data);
        if(head==null){
            head= new_stackClass;
            top++;
            return;
        }
        StackClass temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next= new_stackClass;
        top++;
        return;
    }

    void pop(){
        int i=0;
        StackClass temp=head;
        StackClass prev=null;
        while(i!=top){
            prev=temp;
            temp=temp.next;
            i++;
        }
        prev.next=null;
        top--;
        return;

    }
    void print(){
        StackClass temp=head;
        for(int i=0;i<top;i++){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        return;
    }
}
