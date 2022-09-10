package com.company;

import java.util.Scanner;

class stackarray{
    int top = -1;
    int n = 10;
    int []a = new int[n];
    int size = 0;

    void push(Scanner sc){
        if (top == n - 1) {
            size++;
            System.out.println("STACK OVERFLOW");
        }
        else {
            System.out.println("ENTER DATA-->");
            int i = sc.nextInt();
            top++;
            size++;
            a[top] = i;
            System.out.println("ITEM WILL BE ADDED !!1");
           }
    }
    void pop(){
        if(top == - 1){
            System.out.println("STACK UNDERFLOW !!!");
        }
        else {
            size--;
            top--;
            System.out.println("ITEM WILL BE DELETED !!");
        }
    }
    void size(){
        System.out.println("SIZE OF THE STACK IS -- > " + size);
    }
    void display(){
        System.out.println("ITEMS ARE -->");
        for (int j = top; j >= 0; j--){
            System.out.println(a[j]);
        }
    }
    void max() {
        int max = a[0];
         for (int j = top; j >= 0; j--){
            if (a[j] > max){
                max = a[j];
            }
        }
        System.out.println("MAXIMUM VALUE OF THE STACK IS -->"+max);
    }
    void min(){
        int min = a[0];
        for (int j = top; j >= 0; j--){
            if (a[j] < min){
                min = a[j];
            }
        }
        System.out.println("MINIMUM VALUE OF THE STACK IS -->"+min);
    }
}

    public class STACK_USING_ARRAY{
    public static void main(String[] args) {
        stackarray s = new stackarray();
        Scanner sc = new Scanner(System.in);
        int l , d;
        do {
            System.out.println("PRESS 1 TO PUSH !!!!");
            System.out.println("PRESS 2 TO POP !!!!");
            System.out.println("PRESS 3 TO DISPLAY !!!!");
            System.out.println("PRESS 4 TO SIZE !!!!");
            System.out.println("PRESS 5 TO MIN !!!!");
            System.out.println("PRESS 6 TO MAX !!!!");
             d = sc.nextInt();
            switch (d) {
                case 1 -> s.push(sc);
                case 2 -> s.pop();
                case 3 -> s.display();
                case 4 -> s.size();
                case 5 -> s.max();
                case 6 -> s.min();
            }
            System.out.println("ENTER 0 TH BACK THE MAIN MANY ,IF EXIST ENTER ANY KEY -->");
            l = sc.nextInt();
        }
        while (l == 0);
    }
}