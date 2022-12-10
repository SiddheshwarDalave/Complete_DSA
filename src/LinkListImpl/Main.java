package LinkListImpl;

public class Main {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        for(int i=0;i<=10;i++){
            ll.add(i);
        }
        ll.print();
        ll.reverse();
        ll.print();
        ll.deleteFirst(new Node(10));
        ll.print();
        ll.deleteWithPosition(3);
        ll.print();
    }
}
