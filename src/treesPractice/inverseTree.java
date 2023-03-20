package treesPractice;

public class inverseTree {


    public void flipTree(CustomTrees.Node node){
        if(node==null){
            return;
        }else{
            CustomTrees.Node temp = node.left;
            node.left=node.right;
            node.right=temp;
            flipTree(node.left);
            flipTree(node.right);
        }
    }

    public static void main(String[] args) {
        CustomTrees customTrees = new CustomTrees();
        customTrees.insert(200);
        customTrees.insert(100);
        customTrees.insert(400);
        customTrees.preorder(customTrees.root);

        inverseTree inverseTree = new inverseTree();
        inverseTree.flipTree(customTrees.root);

        customTrees.preorder(customTrees.root);
    }
}
