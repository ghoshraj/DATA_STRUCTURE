package com.company;

import java.util.Scanner;

public class REVERSE_LL {
    static class node{
        int data;
        node next;
        node prev;
        node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    node head = null;
    node tail = null;
    public void creation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter data -->");
        int n;
        do {
            int data = sc.nextInt();
            node new_node = new node(data);
            if (head == null) {
               head = new_node;
               tail = new_node;
            }
            else {
                head.prev = new_node;
                new_node.next = head;
                head = new_node;
            }
            System.out.println("DO YOU ENTER MORE DATA IF YES PRESS 1 --->");
            n = sc.nextInt();
        }
        while (n == 1);
        }
        public void display(){
        node temp = tail;
        if (head == null){
            System.out.println("ll does not exist !!!!");
        }
        else {
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.prev;
            }
            }
        }
    public static void main(String[] args) {
        REVERSE_LL l = new REVERSE_LL();
        l.creation();
        l.display();
    }
}
