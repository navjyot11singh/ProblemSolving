package treesPractice;


//path sum problem


public class roadTaxProb {
    public boolean pathSum(CustomTrees.Node root,int sum){
        if(root==null) return false;
        sum=sum- root.value;

        if(root.left == null && root.right==null ){
            return sum==0;
        }else
            return pathSum(root.left,sum) || pathSum(root.right,sum);
    }

    public static void main(String[] args) {
        CustomTrees customTrees = new CustomTrees();
        customTrees.insert(200);
        customTrees.insert(100);
        customTrees.insert(400);

        roadTaxProb r= new roadTaxProb();
        System.out.println(r.pathSum(customTrees.root, 300));
    }
}
