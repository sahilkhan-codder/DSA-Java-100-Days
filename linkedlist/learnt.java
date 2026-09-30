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
        void insertat(int idx, int val){
            Node temp=head;
            Node tt=new Node(val);
            if(idx == size()){
                insertatend(val);
                return ;
            }
            if (idx==0) {
                insertatbegin(val);
                return ;
            }
            for (int i = 0; i < idx-1; i++) {
                temp=temp.next;   
            }
            tt.next=temp.next;
            temp.next=tt;
        }

        int getat(int idx){
            Node temp=head;
            for (int i = 0; i < idx; i++) {
                temp=temp.next;
            }
            return temp.data;
        }
        void deleteat(int idx){
            Node temp=head;
            for (int i = 0; i < idx-1; i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            if (idx==size()-1) {
                tail=temp;
                return ;
            }
            if(idx==0){
                head=head.next;
                return ;
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

        System.out.println();
        list.insertat(3,69);
        list.display();
        System.out.println("the element at 2 is " + list.getat(5));
        list.deleteat(5);
        list.display();
         System.out.println("the lenght of the linkedlist is "+list.size());
    }
}
