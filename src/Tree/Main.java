package Tree;
//not studied yet
public class Main {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class Binarytree{
        static int index=-1;
        public static Node BuildTree(int nodes[]){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node newNode= new Node(nodes[index]);
            newNode.left=BuildTree(nodes);
            newNode.right=BuildTree(nodes);

            return newNode;
        }
    }

    //preorder traversal -> root, left, right

    public static void preOrder(Node root){
        if(root==null){
            System.out.print("-1"+" ");// can eliminate
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //inOrder Traversal -> left, root, right


    public static void main(String[] args) {

        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree bt=new Binarytree();
        Node root=bt.BuildTree(nodes);
        System.out.println(root.data);
        preOrder(root);

    }
}
