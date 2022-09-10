package com.company;

import java.util.Scanner;

public class FIND_MAX_MIN_IN_LL {
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
        do{
            System.out.println("ENTER DATA --- >");
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

    public void display() {
        node temp = head;
        if (head == null) {
            System.out.println("LL DOES NOT EXIST !!!!");
        } else {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public void max(){
        node temp = head;
        int max = 0;
            while (temp != null) {
                if(temp.data  > max){
                    max = temp.data;
                }
                temp = temp.next;
            }
        System.out.println("THE MAXIMUM ELEMENT IN THE LL IS --->" + "  " +max);
        }

        public void min(){
            node temp = head;
            int min = temp.data;
            while (temp != null) {
                if(temp.data  < min){
                    min = temp.data;
                }
                temp = temp.next;
            }
            System.out.println("THE MAININUM ELEMENT IN THE LL IS --->" + "  " +min);
        }
    public static void main(String[] args) {
        FIND_MAX_MIN_IN_LL ll = new FIND_MAX_MIN_IN_LL();
        ll.creation();
        ll.display();
        ll.max();
        ll.min();
    }
}
