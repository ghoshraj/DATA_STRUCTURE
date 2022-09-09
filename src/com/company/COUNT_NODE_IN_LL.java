package com.company;

import java.util.Scanner;

public class COUNT_NODE_IN_LL {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    node head = null;
    node tail = null;

    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("ENTER DATA :");
            data = sc.nextInt();
            node new_node = new node(data);
            if (head == null) {
                head = new_node;
                tail = head;
                new_node.next = head;
            } else {
                new_node.next = head;
                head = new_node;
                tail.next = new_node;
            }
        System.out.println("DO YOU ENTER MORE DATA,IF YES ENTER 1 ;");
        n = sc.nextInt();
    }
        while (n == 1);
    }

    public void display(){
      node temp = head;
        if(head == null){
            System.out.println("LL DOES NOT EXIST !!");
        }
        else {
            do{
                System.out.println(temp.data);
                temp = temp.next;
            }
            while (temp != head);
        }
    }
    public void count(){
        int c = 0;
        node temp = head;
        if(head == null){
            System.out.println("LL DOES NOT EXIST !!");
        }
        else {
            do{
                c++;
                temp = temp.next;
            }
            while (temp != head);
            System.out.println("TOTAL NODES IN THIS LINKED LIST IS --->" + " " + c);
        }
    }
    public static void main(String[] args) {
        COUNT_NODE_IN_LL ll = new COUNT_NODE_IN_LL();
        ll.creation();
        ll.display();
        ll.count();
    }
}
