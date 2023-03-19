package linkedListpractice;

class IntList
{
    private class Node
    {
        private int v;
        private Node next;	// A link to the next node,
// which is of type Node1

        // Default constructors
        public Node()
        {
            v = 0;
            next = null;
        }


        // Parameterized constructor
        public Node(int i, Node xt)
        {
            v = i;
            next = xt;
        }


    } // end of inner class Node

    private Node head;

    public IntList()
    {
        head = null;
    }


    // copy constructor
    public IntList copy(IntList lst)
    {

        IntList temp= new IntList();

        if(lst.head == null)
            temp.head = null;
        else
        {
            temp.head = null;	// start with an empty list; then
// copy the nodes one by one from lst
            Node t1, t2, t3;	// create 3 temporary pointers

            t1 = lst.head;
            t2 = t3 = null;

            while(t1 != null)	// a node exists in the given list lst;
// so create a new node and copy it
            {

                if (temp.head == null)	// this happens only once
                {
                    t2 = new Node(t1.v, null);
// t2 will always point to the
// last node in the list
                    temp.head = t2;
                }
                else 	// new list is not empty.
// Create a new mode, link it from t2,
// then move t2 to that node
                {
                    t3 = new Node(t1.v, null);
                    t2.next = t3;
                    t2 = t3;
// The above 3 lines can be replaced by
// t2.next = new Node(t1.v, null);
// t2 = t2.next;
                }
                t1 = t1.next;
            }

            t2 = t3 = null; 	// t1 is already null by now

        }
        return temp;

    }


//    public IntList clone(IntList lst1)
//    {
//        return new IntList(lst1);
//    }


    // A method that adds an node to the start of the list
    public void addToStart(int i)
    {
        Node n = new Node(i, head);	// This will result in "next" of
// this new node to point to head
        head = n; 	// Now move "head" to point to this new added node
        n = null;	// Avoid privacy leak

        // NOTE: A better way to achieve exactly what all
// the above three line are doing would be as follows:
        // head = new Node(i, head);
    }



    public Node find(int x)
    {
        if (head == null)
            return null;
        Node t = head;
        while(t != null)
        {
            if (t.v == x)
                return t;		// Is that dangerous ?? See Later
            t = t.next;
        }
        return null;				// value was not found in the list
    }

    public boolean insertAfter (int i, int x)
    {
        // insert a new node with value x after the first node with value i
        // if no node is found with value I, insertion will NOT take place
// and false is returned
        if (head == null)
        {
            System.out.println("\nList is empty. Value " + i + " cannot be found                                  in the list. No insertion is possible");
            return false;
        }
        Node t = head;
        while(t!= null && t.v != i)
            t = t.next;

        if (t == null)
        {
            System.out.println("\nValue " + i + " was not found in the list.                                        No insertion is possible");
            return false;
        }

        // if this point is reached then i is found; do the insertion
        Node n = new Node(x, t.next);
        t.next = n;
        n = null;		// These 3 lines can be replaced by
        // t.next = new Node(x, t.next);
        return true;
    }


    public boolean insertBefore (int i, int x)
    {
        // insert a new node with value x before the first node with value i
        // if no node is found with value I, insertion will NOT take place
        // and false is returned
        if (head == null)
        {
            System.out.println("\nList is empty. Value " + i + " cannot be found                                  in the list. No insertion is possible");
            return false;
        }

        if(head.v == i)	// i is the first value at head
        {
            head = new Node(x, head);
            return true;
        }

        Node t = head;
        while(t.next!= null && t.next.v != i)
            t = t.next;
        if (t.next == null)
        {
            System.out.println("\nValue " + i + " was not found in the list.                                        No insertion is possible");
            return false;
        }

        // if this point is reached then i is found; do the insertion
        Node n = new Node(x, t.next);
        t.next = n;
        n = null;		// These 3 lines can be replaced by
        // t.next = new Node(x, t.next);
        return true;
    }

    // A method to return the size of the list
    public int size()
    {
        int ctr = 0;
        Node temp = head;	// Point to the start of the list
        while( temp!= null)
        {
            ctr++;
            temp = temp.next;
        }
        return ctr;
    }

    // A method that indicates whether or not a value is in the list
    public boolean contains(int i)
    {
        if(find(i) != null)
            return true;
        else
            return false;
    }


    // A method that searches the list for a node with value i1, and, if
// found, the node is modified to have value i2. If there is more than
// one node with value i1, the first node is the one to be modified
    public boolean replace(int i1, int i2)
    {
        Node t = find(i1);
        if(t == null)
        {
            System.out.println("\nCould not find value " + i1 + " in         						the list; no replacement is possible.");
            return false;
        }
        t.v = i2;
        return true;
    }

    public void showListContents()
    {
        Node temp = head;
        if (temp == null)
            System.out.println("\nThere is nothing to display; list is empty." );
        else
            System.out.println("\nHere are the contents of the list." );
        while(temp != null)
        {
            System.out.print(temp.v + " ---> ");
            temp = temp.next;		// Move to the next node
        }
        System.out.println("X");	// Just show "X" indicating
// the end of the list (null)
    }

}
 class LinkedList2 {


    public static void main(String[] args) {

        IntList lst1 = new IntList();

        lst1.addToStart(18);
        lst1.addToStart(22);
        lst1.addToStart(4);
        lst1.addToStart(7);
        lst1.addToStart(32);
        lst1.addToStart(48);
        lst1.addToStart(18);
        lst1.addToStart(12);
        lst1.addToStart(32);

        System.out.println("\nShowing contents of lst1");
        lst1.showListContents();

        IntList lst2 = lst1.copy(lst1);

        System.out.println("\nShowing contents of lst2");
        lst2.showListContents();

        lst2.replace(4, 52);

        lst2.addToStart(98);


        System.out.println("\nShowing contents of lst1");
        lst1.showListContents();

        System.out.println("\nShowing contents of lst2 after modifications");
        lst2.showListContents();

    }

}

