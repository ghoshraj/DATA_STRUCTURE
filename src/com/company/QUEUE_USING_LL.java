package com.company;

import java.util.Scanner;

class queue<I extends Number> {
    static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    node f = null;
    node r = null;
    int size = 0;

    void enqueue(Scanner sc){
        System.out.println("ENTER DATA -->");
        int data = sc.nextInt();
        node new_node = new node(data);
        if (f == null){
            f = new_node;
            r = new_node;
            size++;
        }
        else {
            r.next = new_node;
            r = new_node;
            size++;
        }
    }
    void dequeue(){
        if (f == null){
            System.out.println("LL IS UNDERFLOW");
        }
        else {
            f = f.next;
            size--;
        }
    }
    void size() {
        System.out.println("SIZE OF THE LL IS -->" + size);
    }
    void display(){
        node temp = f;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class QUEUE_USING_LL {
    public static void main(String[] args) {
        queue<Number> q = new queue<Number>();
        Scanner sc = new Scanner(System.in);
        int l , d;
        do {
            System.out.println("PRESS 1 TO ENQUEUE -->");
            System.out.println("PRESS 2 TO DEQUEUE -->");
            System.out.println("PRESS 3 TO DISPLAY !!!!");
            System.out.println("PRESS 4 TO SIZE !!!!");
            d = sc.nextInt();
            switch (d) {
                case 1 -> q.enqueue(sc);
                case 2 -> q.dequeue();
                case 3 -> q.display();
                case 4 ->q.size();
            }
            System.out.println("ENTER 0 TH BACK THE MAIN MANY ,IF EXIST ENTER ANY KEY -->");
            l = sc.nextInt();
        }
        while (l == 0);
    }
}
