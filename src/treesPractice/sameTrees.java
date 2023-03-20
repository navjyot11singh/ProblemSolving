package treesPractice;

//comparision of two binary trees for equality

public class sameTrees {
    public boolean isSameTree(CustomTrees.Node tree1,CustomTrees.Node tree2){
        if(tree1==null && tree2==null){
            return true;
        }

        if(tree1!=null && tree2!=null){
            return tree1.value==tree2.value && isSameTree(tree1.left,tree2.left) && isSameTree(tree1.right,tree2.right);
        }

        return false;
    }

    public static void main(String[] args) {
        CustomTrees customTrees = new CustomTrees();
        customTrees.insert(200);
        customTrees.insert(100);
        customTrees.insert(400);

        CustomTrees customTrees2 = new CustomTrees();
        customTrees2.insert(200);
        customTrees2.insert(100);
        customTrees2.insert(400);

        sameTrees sameTrees = new sameTrees();
        System.out.println(sameTrees.isSameTree(customTrees.root,customTrees2.root));
    }
}
