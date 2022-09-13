package com.company;

import java.util.Stack;

public class QUEUE_USING_STACK {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        static void enqueue(int x){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(x);
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        static int dequeue(){
            if (s1.isEmpty()){
                System.out.println("queue is empty");
                System.exit(0);
            }
            int x = s1.peek();
            s1.pop();
            return x;
        }
        static int size(){
            return s1.size();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        Queue.enqueue(10);
        Queue.enqueue(15);
        Queue.enqueue(20);
        Queue.enqueue(25);
        System.out.println(Queue.dequeue());
        System.out.println(Queue.dequeue());
        System.out.println("size of the queue is now -->"+ Queue.size());
        System.out.println(Queue.dequeue());
        System.out.println(Queue.dequeue());
        System.out.println("size of the queue is now -->"+Queue.size());
    }
}
