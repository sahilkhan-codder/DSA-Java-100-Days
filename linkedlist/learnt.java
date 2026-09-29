package linkedlist;

public class learnt {
    
    
        public static class Node {
            int data;
            Node next;

            Node(int data){
                this.data=data;
            }
            
        }
        
    public static class linkedlist{
        Node head=null;
        Node tail=null;

        void insertatend(int val){
            Node temp=new Node(val);
            if (head==null) {
                head=temp;
                tail=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
        }
        void display(){
            Node temp =head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        int size(){
            int count=0;
            Node temp=head;
            while (temp!=null) {
                count++;
                temp=temp.next;
            }
            return count;
        }
        void insertatbegin(int val){
            Node temp=new Node(val);
            if (head==null) {
                head=temp;
                tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist list=new linkedlist();
        list.insertatend(10);
        list.insertatend(22);
        list.insertatend(55);
        list.insertatend(70);
        list.display();
        System.out.println();

        list.insertatbegin(99);
        System.out.println("the lenght of the linkedlist is "+list.size());
        list.display();
    }
}
