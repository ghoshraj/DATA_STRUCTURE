package com.company;

public class FIND_EVEN_ODD_IN_LL {
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
    void display(node temp){
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    void odd(node temp){
        while (temp != null){
           if (temp.data % 2 != 0){
               System.out.println(temp.data);
           }
            temp = temp.next;
        }
    }
    void even(){
        node temp = head;
        while (temp != null){
            if (temp.data % 2 == 0){
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        FIND_EVEN_ODD_IN_LL l = new FIND_EVEN_ODD_IN_LL();
        l.add_data(1);
        l.add_data(2);
        l.add_data(3);
        l.add_data(4);
        l.add_data(5);
        l.add_data(6);
        l.add_data(7);
        l.add_data(8);
        l.add_data(9);

        System.out.println("data of the linked list are -->");
        l.display(l.head);

        System.out.println("odd data in this ll are -->");
        l.odd(l.head);

        System.out.println("even data in this ll are -->");
        l.even();
    }
}
