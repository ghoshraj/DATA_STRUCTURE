package com.company;

import java.util.Scanner;

public class INSERTION_IN_SINGLE_LL {
    static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    node head = null;

   public void creation(){
        int data , n , m , p;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER DATA :");
        do {
            data = sc.nextInt();
            node new_node = new node(data);
            if (head == null) {
                head = new_node;
            }
            else {
                System.out.println("ENTER 1 TO INSERT AT THE BEGINING , ENTER 2 TO INSERT AT THE END , ENTER 3 TO INSERT PARTICULAR PLACE ");
                m = sc.nextInt();
                switch (m) {
                    case 1 -> {
                        new_node.next = head;
                        head = new_node;
                    }
                    case 2 -> {
                        node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = new_node;
                    }
                    case 3 -> {
                        System.out.println("ENTER POSITION :");
                        p = sc.nextInt();
                        node temp1 = head;
                        for (int i = 0; i < p - 1; i++) {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                    }
                }
            }


            System.out.println("DO YOU WANT ENTER MORE DATA .IF YES PRESS 1 : ");
            n = sc.nextInt();
        }
        while (n ==1);
    }

    public void traverser(){
        node temp = head;
        if (head == null){
            System.out.println("LL DOES NOT EXIST :");
        }
        else {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
       INSERTION_IN_SINGLE_LL ll = new INSERTION_IN_SINGLE_LL();
        ll.creation();
        ll.traverser();

    }
}
