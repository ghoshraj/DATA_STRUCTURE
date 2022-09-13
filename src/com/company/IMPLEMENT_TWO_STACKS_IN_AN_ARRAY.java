package com.company;

class twostack{
    int []arr;
    int size;
    int top1, top2;
    twostack(int n){
        size = n;
        arr = new int[n];
        top1 = n / 2 + 1;
        top2 = n / 2;
    }
    void push1(int x){
        if (top1 > 0){
            top1--;
            arr[top1] = x;
        }
        else {
            System.out.println("stack overflow !!!!");
        }
    }
    void push2(int x){
        if (top2 < size - 1){
            top2++;
            arr[top2] = x;
        }
        else {
            System.out.println("stack is overflow !!!");
        }
    }
    int pop1(){
        if (top1 <= size / 2){
            int x = arr[top1];
            top1++;
            return  x;
        }
        else {
            System.out.println("stack is underflow");
        }
        return  0;
    }
    int pop2(){
        if (top2 > size / 2 + 1){
            int x = arr[top2];
            top2--;
            return x;
        }
        else {
            System.out.println("stack is underflow");
        }
        return 0;
    }
}
public class IMPLEMENT_TWO_STACKS_IN_AN_ARRAY {
    public static void main(String[] args) {
        twostack t = new twostack(5);
        t.push1(3);
        t.push1(7);
        t.push2(8);
        t.push1(9);
        t.push2(2);
        System.out.println(t.pop1());
    }
}
