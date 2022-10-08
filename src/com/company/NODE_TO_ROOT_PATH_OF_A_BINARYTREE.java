package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class NODE_TO_ROOT_PATH_OF_A_BINARYTREE {
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
           if (nodes[index] == - 1){
               return null;
           }
           node newNode = new node(nodes[index]);
           newNode.left = buildtree(nodes);
           newNode.right = buildtree(nodes);

           return newNode;
       }
    }
    static ArrayList<Integer> path;
    public static boolean find(node Node , int data){
        if (Node == null){
            return false;
        }
        if (Node.data == data){
            path.add(Node.data);
            return true;
        }
        boolean findleft = find(Node.left , data);
        if (findleft){
            path.add(Node.data);
            return true;
        }
        boolean findright = find( Node.right , data);
        if (findright){
            path.add(Node.data);
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int []nodes = {1 , 2 , 4, -1 ,-1 ,5 , -1 ,-1 ,3 , -1 , 6 ,-1 ,-1};
        binarytree b = new binarytree();
        node root = b.buildtree(nodes);
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        path = new ArrayList<>();
        boolean found = find(root , data);
        System.out.println(found);
        System.out.println(path);
    }
}
