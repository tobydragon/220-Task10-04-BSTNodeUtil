package edu.ithaca.dragon.datastructures.tree;

public class BinaryTreeHeightExperimentMain {

    public static void main(String[] args){
        BTNode<Integer> root = new BTNode<Integer>(0);
        for (int i=0; i<100000; i++){
            BTNodeUtil.balancedAdd(root, 0);
            if (i%500==0){
                System.out.println("" + i + "\t " + BTNodeUtil.height(root));
            }
        }
    }
    
}
