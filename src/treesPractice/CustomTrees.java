package treesPractice;


import Queues.CustomQueue;
import Queues.QueueMain;

public class CustomTrees {

    Node root;
    class Node{
        int value;
        Node left;
        Node right;

        Node(int data){
            this.value=data;
        }

        Node(int value,Node left,Node right){
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }


    public void insert(int data){
        this.root = insertData(this.root,data);
    }


    public boolean search(Node root,int data){
        if(root==null) return false;
        else if(root.value==data) return true;
        else if(data < root.value) return search(root.left,data);
        else return search(root.right,data);
    }


    public Node insertData(Node child,int data){
        if(child==null){
            child  = new Node(data);
            return child;
        }else if(data<child.value){
            child.left=insertData(child.left,data);
        }else{
            child.right = insertData(child.right,data);
        }

        return child;
    }

    public int findMin(){
        Node current = root;
        current=current.left;

        if(root==null){
            System.out.println("Tree is empty");
            return -1;
        }
        while (current.left!=null){
            current=current.left;
        }
        return current.value;
    }

    public int findMinUsingRecursion(Node root){
        if(root==null){
            System.out.println("Tree is empty");
            return -1;
        }else if(root.left==null){
            return root.value;
        }

        return findMinUsingRecursion(root.left);
    }

    public int findHeight(Node root){
       if(root==null){
           return -1;
       }
       int leftHeight = findHeight(root.left);
       int rightHeight = findHeight(root.right);

       return Math.max(leftHeight,rightHeight)+1;
    }


    public void levelOrder(Node root){
        if(root==null){
            return;
        }
        QueueNode customQueue = new QueueNode();
        customQueue.insert(root);

        while (!customQueue.isEmpty()){
            Node current = customQueue.front();
            System.out.println("Data is "+current.value);
            if(current.left!=null) customQueue.insert(current.left);
            if(current.right!=null) customQueue.insert(current.right);
            customQueue.remove();
        }


    }

    public void preorder(Node root){
        if(root==null)return;
        System.out.println("Data is "+root.value);
        preorder(root.left);
        preorder(root.right);
    }

    public void postOrder(Node root){
        if(root==null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println("Data is "+root.value);
    }
    public void inOrder(Node root){
        if(root==null)return;
        inOrder(root.left);
        System.out.println("Data is "+root.value);
        inOrder(root.right);
    }


    public boolean isSubTreeLesser(){

    }

    public boolean isSubTreeGreater(){

    }

    public boolean isBinarySearchTree(){
        if(root==null){
            return true;
        }
        if(isSubTreeLesser() && isSubTreeGreater() && isBinarySearchTree() && isBinarySearchTree()) {
            return true;
        }

        return false;
    }



    public static void main(String[] args) {
        CustomTrees customTrees = new CustomTrees();
        customTrees.insert(200);
        customTrees.insert(100);
        customTrees.insert(80);
        customTrees.insert(50);
        customTrees.insert(20);
        customTrees.insert(10);


        System.out.println("height of tree: "+customTrees.findHeight(customTrees.root));
        System.out.println("min: "+customTrees.findMin());
        System.out.println("min using recursion: "+customTrees.findMinUsingRecursion(customTrees.root));

        System.out.println();
        System.out.println();
        System.out.println("Level order");
        customTrees.levelOrder(customTrees.root);


        System.out.println();
        System.out.println();
        System.out.println("Pre order");
        customTrees.preorder(customTrees.root);

        System.out.println();
        System.out.println();
        System.out.println("In order");
        customTrees.inOrder(customTrees.root);

        System.out.println();
        System.out.println();
        System.out.println("Post order");
        customTrees.postOrder(customTrees.root);

        System.out.println(customTrees.search(customTrees.root, 80));


    }
}





