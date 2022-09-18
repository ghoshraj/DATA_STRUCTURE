    package com.company;

    import java.util.Scanner;

    public class BINARY_TREE_TRAVERSAL {
        static node creation(){
            int data;
            Scanner sc = new Scanner(System.in);
            node root;
            System.out.println("enter value--->");
            data = sc.nextInt();
            if (data == -1)
                return null;
            root = new node(data);
            System.out.println("enter left child of --->" + root.data);
            root.left = creation();
            System.out.println("enter right child of --->" + root.data);
            root.right = creation();

            return root;
        }
        static void inorder(node root){
            if (root == null){
                return;
            }
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
        static void preorder(node root){
            if (root == null){
                return;
            }
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
        static void postorder(node root){
            if (root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }
        public static void main(String[] args) {
            node root = creation();
            assert root != null;
            postorder(root);
            preorder(root);
            inorder(root);
        }
    }
    class node{
        int data;
        node left;
        node right;
      public node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
