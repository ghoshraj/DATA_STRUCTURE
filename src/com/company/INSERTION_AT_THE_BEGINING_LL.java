package com.company;

import java.util.Scanner;

public class INSERTION_AT_THE_BEGINING_LL{
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
    public void traverser(){
        node temp = head;
        if (head == null){
            System.out.print("LL DOES NOT EXIST !!!!!");
        }
        else {
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        INSERTION_AT_THE_BEGINING_LL ll = new INSERTION_AT_THE_BEGINING_LL();
        ll.creation();
        ll.traverser();
    }
}