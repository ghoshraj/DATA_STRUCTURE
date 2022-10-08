package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class BINARYTREE_TRAVERSAL{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class binarytrees{
        static int idx = -1;
        public static Node buildtree(int nodes[]){
            idx++;
            if (nodes[idx] == -1){
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);

            return newnode;
        }
    }
    public static void preorder(Node root){
        if (root == null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void postorder(Node root){
        if (root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
    public static void levelorder(Node root){
        Queue<Node>q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()){
            Node currentnode = q.remove();
            if (currentnode == null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                System.out.println(currentnode.data);
                if (currentnode.left != null){
                    q.add(currentnode.left);
                }
                if (currentnode.right != null){
                    q.add(currentnode.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1 , 2 , 4, -1 ,-1 ,5 , -1 ,-1 ,3 , -1 , 6 ,-1 ,-1};
        binarytrees b = new binarytrees();
        Node root = b.buildtree(nodes);
        System.out.println("tree root is-->");
        System.out.println(root.data);
        System.out.println("preorder traversal-->");
        preorder(root);
        System.out.println("inorder traversal-->");
        inorder(root);
        System.out.println("postorder traversal-->");
        postorder(root);
        System.out.println("level order traversal-->");
        levelorder(root);

    }
}