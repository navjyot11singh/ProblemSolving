package linkedListpractice;
public class LL {

    private Node head;
    private Node tail;
    private int size;


    public LL(){
        this.size=0;

    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertAtLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);

            tail.next=node;
            tail=node;
            size++;


    }

    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }

        if(index==size){
            insertAtLast(val);
            return;
        }

        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }

        Node n   = new Node(val,temp.next);
        temp.next=n;

        size++;

    }


    public int deleteFirst(){
        int value  = head.value;
        head = head.next;

        if(head==null){
            tail=null;
        }
        size--;
        return value;
    }


    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }

        Node secondLast = get(size-2);
        int val = tail.value;
        tail =  secondLast;
        tail.next = null;
        return val;
    }


    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next=prev.next.next;

        return val;
    }

    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
             node = node.next;
        }
        return null;
    }

    public Node get(int index){
        Node node = head;

        for(int i=0;i<index;i++){
            node = node.next;
        }

        return node;
    }


    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value+" -> ");
            temp=temp.next;
        }

        System.out.println("END");
    }


    public void swapConsecutive(LL ll){
        Node prev = null;
        Node current = ll.head;
        Node forward = current.next;


        while (current.next!=null){
            forward.next = current;
            current.next = prev;
            prev.next = forward;
        }
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }


        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
}
