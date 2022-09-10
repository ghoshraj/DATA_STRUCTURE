package com.company;

import java.util.Scanner;

class stackll{
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        node top = null;
        int size = 0;
        public void push( Scanner sc){
            System.out.println("ENTER DATA -->");
            int data = sc.nextInt();
            node new_node = new node(data);
            if (top  == null){
                size++;
                top = new_node;
            }
            else {
                size++;
                new_node.next = top;
                top = new_node;
            }
        }
        void pop(){
            if (top == null){
                System.out.println("STACK IS EMPTY !!!");
            }
            else {
                size--;
                top = top.next;
            }
        }
        void display(){
            node temp = top;
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        public void size(){
            System.out.println("SIZE OF THE LL IS -->" + size);
           }
}
public class STACK_USING_LL {
    public static void main(String[] args) {
        stackll s = new stackll();
         Scanner sc = new Scanner(System.in);
        int l , d;
        do {
            System.out.println("PRESS 1 TO PUSH !!!!");
            System.out.println("PRESS 2 TO POP !!!!");
            System.out.println("PRESS 3 TO DISPLAY !!!!");
            System.out.println("PRESS 4 TO SIZE !!!!");
             d = sc.nextInt();
            switch (d) {
                case 1 -> s.push(sc);
                case 2 -> s.pop();
                case 3 -> s.display();
                case 4 -> s.size();
            }
            System.out.println("ENTER 0 TH BACK THE MAIN MANY ,IF EXIST ENTER ANY KEY -->");
            l = sc.nextInt();
        }
        while (l == 0);
    }
}
