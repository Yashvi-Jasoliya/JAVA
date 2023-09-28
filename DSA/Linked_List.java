package DSA_IN_JAVA;

public class Linked_List {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

//    Methods
    public static Node head;
    public static Node tail;

    public void addFirst(int data){

//      step:-1  create new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
//      step:-2 newNode next = head
        newNode.next = head; // link

//      step:-3 head = newNode
        head = newNode;
    }

    public void addLast(int data){

//      step:-1  create new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
//      step:-2 tail next = null
        tail.next = newNode; // link

//      step:-3 tail = newNode
        tail = newNode;
    }

    public void print(){ // O(n)
//        if(head == null){
//            System.out.println("Linked list is empty");
//             return;
//        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Linked_List ll = new Linked_List();
//        ll.head = new Node(5);
//        ll.head.next = new Linked_List.Node(56)

        ll.print();
        ll.addFirst(6);
        ll.print();
        ll.addFirst(5);
        ll.print();
        ll.addLast(7);
        ll.print();
        ll.addLast(8);
        ll.print();
    }
}
