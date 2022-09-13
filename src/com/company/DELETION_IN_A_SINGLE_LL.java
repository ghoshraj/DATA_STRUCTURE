package com.company;

import java.util.Scanner;

public class DELETION_IN_A_SINGLE_LL{
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
        int data , n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("ENTER DATA:");
            data = sc.nextInt();
           node new_node = new node(data);
            if (head == null){
                head = new_node;
            }
            else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("DO YOU WANT ENTER MORE DATA .IF YES PRESS 1 : ");
            n = sc.nextInt();
        }
        while (n == 1);
    }
    public void deletion(){
        int m , p ,n;
        Scanner sc = new Scanner(System.in);
        do{
            if (head == null){
                System.out.println("LL DOES NOT EXIST !!!");
            }
            else {
                System.out.println("ENTER 2 TO DELETE THE ITEM FOR BEGENING , ENTER 3 TO DELETE THE ITEM FOR LAST ,ENTER 4 TO DELETE THE ITEM FOR PARTICULAR PLACE");
                m = sc.nextInt();
                switch (m) {
                    case 1 -> {
                        node temp = head;
                        temp = temp.next;
                        head = temp;
                    }
                    case 2 -> {
                        node temp1 = head;
                        node ptr = temp1.next;
                        while (ptr.next != null) {
                            temp1 = ptr;
                            ptr = ptr.next;
                        }
                        temp1.next = null;
                    }
                    case 3 -> {
                        System.out.println("ENTER POSITION:");
                        p = sc.nextInt();
                        node temp2 = head;
                        node ptr1 = temp2.next;
                        for (int i = 0; i < p - 1; i++) {
                            temp2 = ptr1;
                            ptr1 = ptr1.next;
                        }
                        temp2.next = ptr1.next;
                    }
                }
            }
            System.out.println("DO YOU WANT ENTER MORE DATA .IF YES PRESS 1 : ");
            n = sc.nextInt();
        }
        while (n == 1);
    }
    public void traverser(){
        node temp = head;
        if (temp == null){
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
        DELETION_IN_A_SINGLE_LL ll = new DELETION_IN_A_SINGLE_LL();
        ll.creation();
        ll.deletion();
        ll.traverser();
    }
}
