package LinkListImpl;

//Singly LinkedList



public class LinkedList {
    Node head;

    //methods
    void reverse(){
        if(head==null){
            throw new Error("head is null");
        }
        if(head.next==null){
            return;
        }
        Node temp=head;
        Node curr=head;
        Node prev=null;

        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        head=prev;
        return;
    }
    int size(){
        int n=0;
        Node temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        return n;
    }

    void deleteWithPosition(int n){
        if(n<=0 || n>size()){
            throw new Error("Invalid input");
        }
        if(n==1){
            head=head.next;
            return;
        }
        Node temp=head;
        Node prev=null;
        int pos=1;
        while(pos!=n){
            prev=temp;
            temp=temp.next;
            pos++;
        }
        prev.next=temp.next;
        return;
    }

    void deleteFirst(Node node){
        Node temp=head;
        Node prev=null;
        if(head.data== node.data){
            head=head.next;
            return;
        }
        while(node.data!= temp.data){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
        return;
    }
    void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void add(int data){

        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
        return;
    }

}
