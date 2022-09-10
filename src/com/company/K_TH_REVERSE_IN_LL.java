package com.company;

public class K_TH_REVERSE_IN_LL {
     class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
   Node head = null;

    Node reverse(Node head , int k){
        if (head == null)
            return null;
       Node current = head;
       Node next = null;
       Node prev = null;
       int count = 0;

       while (count < k && current != null){
           next = current.next;
           current.next = prev;
           prev = current;
           current = next;
           count++;
       }
       if (next != null)
           head.next = reverse(next , k);
       return prev;
    }
    public void add(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void display(){
         Node temp = head;
         while (temp != null){
             System.out.println(temp.data);
             temp = temp.next;
         }
    }
    public static void main(String[] args) {
        K_TH_REVERSE_IN_LL l = new K_TH_REVERSE_IN_LL();
        l.add(10);
        l.add(20);
        l.add(25);
        l.add(30);
        l.add(35);
        l.add(40);
        l.add(45);
        l.add(50);
        l.add(55);
        l.add(60);
       // l.display();
        l.head = l.reverse(l.head , 3);
        l.display();
    }
}
