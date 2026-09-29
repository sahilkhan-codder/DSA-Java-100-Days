package linkedlist;

public class linkedlistCRUD {
    
    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
        
    }
    public static void displayr(Node head){
        int count=0;
       if (head==null) return;
        else {
            count++;
        System.out.print(head.data+" ");
        displayr(head.next);
       }
    }
    public static void main(String[] args) {
        Node a = new Node(2);        
        Node b = new Node(4);  
        Node c = new Node(8);  
        Node d = new Node(16);  

        a.next=b;
        b.next=c;
        c.next=d;
        Node temp=a;
        // for (int i = 0; i < 4; i++) {
        //     System.out.print(temp.data + " -> ");
        //     temp=temp.next;
            
        // }

        // but we should use the while 
        // while (temp!=null) {
        //     System.out.print(temp.data +" ");
        //     temp=temp.next;
           
        // }

        // display using recursion
        displayr(a);
        
    }
}
