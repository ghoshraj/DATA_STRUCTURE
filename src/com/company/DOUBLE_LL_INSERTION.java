package com.company;

import java.util.Scanner;

public class DOUBLE_LL_INSERTION {
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

    public void creation(){
        int data , n , m , p;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("ENTER DATA --->");
            data = sc.nextInt();
            node new_node = new node(data);
            if (head == null){
                head = new_node;
                tail = new_node;
            }
            else {
                System.out.println("ENTER 1 TO ADD THE ITEM FOR BEGENING , ENTER 2 TO ADD THE ITEM FOR LAST ,ENTER 3 TO ADD THE ITEM FOR PARTICULAR PLACE");
                m = sc.nextInt();
                switch (m) {
                    case 1 -> {
                        head.prev = new_node;
                        new_node.next = head;
                        head = new_node;
                    }
                    case 2 -> {
                        tail.next = new_node;
                        new_node.prev = tail;
                        tail = new_node;
                    }
                    case 3 -> {
                        System.out.println("ENTER POSITION --->");
                        p = sc.nextInt();
                        node temp = head;
                        node ptr = head.next;
                        for (int i = 1; i < p - 1; i++) {
                            temp = ptr;
                            ptr = ptr.next;
                        }
                        new_node.prev = temp;
                        new_node.next = ptr;
                        temp.next = new_node;
                        ptr.prev = new_node;
                    }
                }
            }
            System.out.println("DO YOU ENTER MORE DATA IF YES PRESS 1 --->");
            n = sc.nextInt();
        }
        while (n == 1);
    }
    public void traverser(){
       node temp = head;
        if (head == null){
            System.out.println("LL DOES NOT EXIST !!!!");
        }
        else {
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        DOUBLE_LL_INSERTION ll = new DOUBLE_LL_INSERTION();
        ll.creation();
        ll.traverser();
    }
}