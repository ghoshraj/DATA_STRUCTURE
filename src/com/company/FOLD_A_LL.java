package com.company;

public class FOLD_A_LL {
    static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    node head = null;
    void add_data(int new_data){
        node new_node = new node(new_data);
        new_node.next = head;
        head = new_node;
    }
    static node findmid(node head){
        if (head == null || head.next == null){
            return head;
        }
        node first = head;
        node last = head;
        while (last.next != null && last.next.next != null){
            first = first.next;
            last = last.next.next;
        }
           return  first;
    }
    static node reverse(node head){
        if (head == null || head.next == null)
            return head;
        node pre = null;
        node cur = head;
        node forw = null;

        while (cur != null){
            forw = cur.next;

            cur.next = pre;
            pre = cur;
            cur = forw;
        }
        return pre;
    }
    static void fold(node head){
        if (head == null || head.next == null)
            System.out.println(head);

        node mid = findmid(head);
        node new_node = mid.next;
        mid.next = null;

        new_node = reverse(new_node);

        node c1 = head;
        node c2 = new_node;
        node f1 = null;
        node f2 = null;

        while (c2 != null){
            f1 = c1.next;
            f2 = c2.next;

            c1.next = c2;
            c2.next = f1;

            c1 = f1;
            c2 = f2;
        }
    }
    void display(node temp){
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        FOLD_A_LL l = new FOLD_A_LL();
        l.add_data(10);
        l.add_data(20);
        l.add_data(30);
        l.add_data(40);
        l.add_data(50);
        l.add_data(60);
        l.add_data(70);
       // l.display(l.head);
        l.fold(l.head);
        l.display(l.head);
    }
}
