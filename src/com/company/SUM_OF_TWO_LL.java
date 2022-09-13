package com.company;

public class SUM_OF_TWO_LL {
    static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    node head = null;
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
    static node add(node l1 , node l2){
        if (l1 == null || l2 == null)
            return (l1 != null ? l1 : l2);

        node c1 = reverse(l1);
        node c2 = reverse(l2);

        node head = new node(-1);
        node itr = head;

        int carry = 0;
        while (c1 != null || c2 != null || carry != 0){
            int sum = carry + (c1 != null ? c1.data : 0) + (c2 != null ? c2.data : 0);
            int dig  = sum % 10;
            carry = sum / 10;

            itr.next = new node(dig);
            itr = itr.next;

            if (c1 != null)
                c1 = c1.next;
            if (c2 != null)
                c2 = c2.next;
        }
        return (reverse(head.next));
    }
    void add_data(int new_data){
        node new_node = new node(new_data);
        new_node.next = head;
        head = new_node;
    }
    static void display(node temp){
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        node result = null;

        SUM_OF_TWO_LL l1 = new SUM_OF_TWO_LL();
        SUM_OF_TWO_LL l2 = new SUM_OF_TWO_LL();

        l1.add_data(4);
        l1.add_data(5);
        l1.add_data(6);
        l1.add_data(7);
        l1.add_data(8);

        System.out.println("PRINT FIRST LL--->");
        display(l1.head);

        l2.add_data(9);
        l2.add_data(3);
        l2.add_data(2);
        l2.add_data(1);

        System.out.println("PRINT SECOND LL--->");
        display(l2.head);

        result = add(l1.head,l2.head);
        System.out.println("SUM OF THE LL -->");
        display(result);
    }
}
