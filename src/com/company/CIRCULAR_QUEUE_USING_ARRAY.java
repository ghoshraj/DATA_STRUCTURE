package com.company;

import java.util.Scanner;

class circularqueue{
    int f = -1;
    int r = -1;
    int n = 10;
    int q [] = new int[n];
    int index = -1;

    void enqueue(Scanner sc){
        if (f == (r + 1) % n){
            System.out.println("QUEUE IS OVERFLOW ");
        }
        else {
            System.out.println("ENTER DATA -->");
            int i = sc.nextInt();
            if (r == -1 && f == -1){
                f = 0;
                r = 0;
                index++;
                q[r]= i;
            }
            else {
                r = (r+1)%n;
                index++;
                q[r] = i;
            }
        }
    }
    void dequeue(){
        if (f == - 1 && r == - 1){
            System.out.println("QUEUE IS UNDERFLOW");
        }
        else if (f == r){
            System.out.println("QUEUE IS UNDERFLOW");
        }
        else {
            f = (f + 1) % n;
            index--;
        }
    }
    void size(){
        System.out.println("INDEX OF THE QUEUE IS -->"+ index);
    }
    void display() {
        System.out.println("ITEMS ARE -->");
        int i;
        for (i = f; i != r; i = (i + 1) % n) {
            System.out.println(q[i]);
        }
        System.out.println(q[i]);
    }
}
public class CIRCULAR_QUEUE_USING_ARRAY {
    public static void main(String[] args) {
        circularqueue c = new circularqueue();
        Scanner sc = new Scanner(System.in);
        int l , d;
        do {
            System.out.println("PRESS 1 TO ENQUEUE -->");
            System.out.println("PRESS 2 TO DEQUEUE -->");
            System.out.println("PRESS 3 TO DISPLAY !!!!");
            System.out.println("PRESS 4 TO SIZE !!!!");
            d = sc.nextInt();
            switch (d) {
                case 1 -> c.enqueue(sc);
                case 2 -> c.dequeue();
                case 3 -> c.display();
                case 4 ->c.size();
            }
            System.out.println("ENTER 0 TH BACK THE MAIN MANY ,IF EXIST ENTER ANY KEY -->");
            l = sc.nextInt();
        }
        while (l == 0);
    }
}
