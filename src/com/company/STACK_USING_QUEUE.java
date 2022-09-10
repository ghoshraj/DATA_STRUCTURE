package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class STACK_USING_QUEUE {
    static class stack{
        static Queue<Integer>q1 = new LinkedList<Integer>();
        static Queue<Integer>q2 = new LinkedList<Integer>();

        static void push(int x){
            q2.add(x);
            while (!q1.isEmpty()){
                q2.add(q1.peek());
                q1.remove();
            }
            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
        }

        static void pop(){
            while (q1.isEmpty())
                return;
            q1.remove();
        }

        static int top(){
            if (q1.isEmpty())
                return -1;
            return q1.peek();
        }

        static int Size(){
            return q1.size();
        }
    }
    public static void main(String[] args) {
       stack s = new stack();
       stack.push(10);
       stack.push(20);
       stack.push(30);
       stack.push(40);
        System.out.println("current size-->" + stack.Size());
        System.out.println(stack.top());
       stack.pop();
        System.out.println(stack.top());
        stack.pop();
        System.out.println("current size-->" + stack.Size());
        System.out.println(stack.top());
    }
}
