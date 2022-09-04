package com.company;

import java.util.Scanner;

public class CIRCULAR_LL_INSERTION{
    static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    node head = null;
    node tail = null;

    public void creation(){
        int data , n ,m, p;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("ENTER DATA :");
            data = sc.nextInt();
            node new_node = new node(data);
            if(head == null){
                head = new_node;
                tail = head;
                new_node.next = head;
            }
            else {
                System.out.println("ENTER 1 TO ADD THE ITEM FOR BEGENING , ENTER 2 TO ADD THE ITEM FOR LAST ,ENTER 3 TO ADD THE ITEM FOR PARTICULAR PLACE");
                m = sc.nextInt();
                switch (m) {
                    case 1 -> {
                        new_node.next = head;
                        head = new_node;
                        tail.next = new_node;
                    }
                    case 2 -> {
                        tail.next = new_node;
                        tail = new_node;
                        new_node.next = head;
                    }
                    case 3 -> {
                        System.out.println("ENTER POSITION");
                        p = sc.nextInt();
                        node temp1 = head;
                        for (int i = 0; i < (p - 1); i++) {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                    }
                }
            }
            System.out.println("DO YOU ENTER MORE DATA,IF YES ENTER 1 ;");
            n = sc.nextInt();
        }
        while (n == 1);
    }

    public void traverser(){
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
    public static void main(String[] args) {
        CIRCULAR_LL_INSERTION ll = new CIRCULAR_LL_INSERTION();
        ll.creation();
        ll.traverser();
    }
}
