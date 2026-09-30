package linkedlist;

public  class pratice{
    public static class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
    }
    public static class linked{
    Node head=null;
    Node tail=null;
    int size=0;

    void insertatend(int val){
        Node temp=new Node(val);
        if (head==null){
            head=temp;
            tail=temp;
        }else {
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    void insertatbegin(int val){
        Node temp=new Node(val);
        if (head==null){
            head=temp;
            tail=temp;
        }else {
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void insertat(int idx, int val){
        Node temp=head;
        Node ss=new Node(val);

        if (idx==0) {
            insertatbegin(val);
            return ;
        }else if(idx == size-1){
            insertatend(val);
            return ;
        }
        for (int i = 0; i < idx-1; i++) {
            temp=temp.next;
        }
        ss.next=temp.next;
        temp.next=ss;
        size++;
    }
    void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data +" ");
            temp=temp.next;
        }  
    }
     int get(int idx){
        Node temp=head;
            for (int i = 0; i < idx-1; i++) {
                temp=temp.next;
            }
            return temp.data;
        }

        void deleteat(int idx){
            Node temp=head;
            if (idx==0) {
                head=head.next;
                return ;
            } if(idx==size-1){
                return ;
            }
            for (int i = 0; i < idx-1; i++) {
                temp=temp.next;
            }
                temp.next=temp.next.next;
            size--;
        }
    }
    public static void main(String[] args) {
        linked ll=new linked();
        ll.insertatbegin(29);
        ll.insertatend(67);
        ll.insertatend(32);
        ll.insertatend(47);
        ll.insertatbegin(73);
        System.out.println();
        ll.display();
        ll.insertat(3, 0);
        System.out.println();
        ll.display();
        ll.deleteat(1);
        System.out.println();
        ll.display();
        System.out.println("the lenght is "+ ll.size);
    }
    }