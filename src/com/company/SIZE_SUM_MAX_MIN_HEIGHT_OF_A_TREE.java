package com.company;

public class SIZE_SUM_MAX_MIN_HEIGHT_OF_A_TREE {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class binarytree{
        static int index = -1;
        public static node buildtree(int [] nodes){
            index ++;
            if (nodes[index] == -1){
                return null;
            }
            node newNode = new node(nodes[index]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);

            return newNode;
        }
    }
    public static int size(node root){
        if (root == null){
            return 0;
        }
        int leftsize = size(root.left);
        int rightsize = size(root.right);

        int mysize = Math.max(leftsize , rightsize) + 1;

        return mysize;
    }
    public static int sum(node root){
        if (root == null){
            return 0;
        }
        int leftsum = sum(root.left);
        int rightsum = sum(root.right);

        return leftsum + rightsum + root.data;
    }
    public static int max(node root){
        if (root == null){
            return 0;
        }
        int leftmax = max(root.left);
        int rightmax = max(root.right);

        int mymax = Math.max(leftmax , rightmax);
        int mymax1 = Math.max(mymax , root.data);

        return mymax1;
    }
    public static int min(node root) {
        if (root == null){
            return 0;
        }
        int leftmin = min(root.left                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  );
        int rightmin = min(root.right);

        int mymin = Math.min(leftmin , rightmin);
        return Math.min(mymin , root.data);
    }

    public static int height(node root){
        if (root == null){
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);

        int myheight = Math.max(leftheight , rightheight) + 1;

        return myheight;
    }
    public static void main(String[] args) {
        int []nodes = {1 , 2 , 4, -1 ,-1 ,5 , -1 ,-1 ,3 , -1 , 6 ,-1 ,-1};
        binarytree b = new binarytree();
        node root = b.buildtree(nodes);
        System.out.println("SIZE OF THE BINARYTREE IS -->"+size(root));
        System.out.println("SUM OF THE BINARYTREE IS -->"+sum(root));
        System.out.println("MAX OF THE BINARYTREE IS -->"+max(root));
        System.out.println("MIN OF THE BINARYTREE IS -->"+min(root));
        System.out.println("height OF THE BINARYTREE IS -->"+height(root));
    }
}
