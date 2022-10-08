package com.company;

import java.util.Scanner;

public class K_LEVEL_DOWN_BINARYTREE {
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
      public static node buildtree(int[]nodes){
          index ++;
          if (nodes[index] == -1){
              return null;
          }
          node newNode = new node(nodes[index]);
          newNode.right = buildtree(nodes);
          newNode.left = buildtree(nodes);

          return newNode;
      }
    }
    public static void printklevel(node Node , int k){
        if (Node == null || k < 0){
            return;
        }
        if (k == 0){
            System.out.println(Node.data);
        }
        printklevel(Node.left , k - 1);
        printklevel(Node.right , k - 1);
        System.out.println(Node.left);
        System.out.println(Node.right);
    }
    public static void main(String[] args) {
        int []nodes = {1 , 2 , 4, -1 ,-1 ,5 , -1 ,-1 ,3 , -1 , 6 ,-1 ,-1};
        binarytree b = new binarytree();
        node root = b.buildtree(nodes);
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        printklevel(root , k);
    }
}
