package com.company;

import java.util.Scanner;

class queuesarray{
    int f = -1;
    int r = -1;
    int n = 10;
    int q [] = new int[n];
    int size = -1;

    void enqueue(Scanner sc){
        if (r == n - 1){
            System.out.println("QUEUE IS OVERFLOW ");
        }
        else {
            System.out.println("ENTER DATA -->");
            int i = sc.nextInt();
            if (r == -1 && f == -1){
                f = 0;
                r = 0;
                size++;
                q[r]= i;
            }
            else {
                r++;
                size++;
                q[r] = i;
            }
        }
    }
    void dequeue(){
        if (f == - 1 && r == - 1){
            System.out.println("QUEUE IS UNDERFLOW");
        }
        else {
            f++;
            size--;
        }
    }
    void size(){
        size = size+1;
        System.out.println("SIZE OF THE QUEUE IS -->"+ size);
    }
    void display(){
        System.out.println("ITEMS ARE -->");
        for (int i = f; i <= r; i++){
            System.out.println(q[i]);
        }
    }
}
public class QUEUES_USING_ARRAY {
    public static void main(String[] args) {
        queuesarray a = new queuesarray();
        Scanner sc = new Scanner(System.in);
        int l , d;
        do {
            System.out.println("PRESS 1 TO ENQUEUE -->");
            System.out.println("PRESS 2 TO DEQUEUE -->");
            System.out.println("PRESS 3 TO DISPLAY !!!!");
            System.out.println("PRESS 4 TO SIZE !!!!");
            d = sc.nextInt();
            switch (d) {
                case 1 -> a.enqueue(sc);
                case 2 -> a.dequeue();
                case 3 -> a.display();
                case 4 -> a.size();
            }
            System.out.println("ENTER 0 TH BACK THE MAIN MANY ,IF EXIST ENTER ANY KEY -->");
            l = sc.nextInt();
        }
        while (l == 0);
    }
}
