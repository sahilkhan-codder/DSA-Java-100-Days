package linkedlist;
public class linkedlist {
    Node head;
    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addlist(String data){
        Node newNode=new Node(data);
        if (head==null) {
            newNode.next=newNode;
            
        }
    }

    public static void main(String[] args) {
        
    }
}
