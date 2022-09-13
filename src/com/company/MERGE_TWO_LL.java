package com.company;

    public class MERGE_TWO_LL {
        static class node{
            int data;
            node next;
            node(int data){
                this.data = data;
                this.next = null;
            }
        }
        node head = null;

         static node getmid(node head){
            if (head == null || head.next == null){
                return head;
            }
            node first = head;
            node last = head;
            while (last.next != null && last.next.next != null){
                first = first.next;
                last = last.next.next;
            }
            return first;
        }
          static node merge( node left ,node right){
            if (left == null){
                return right;
            }
            if (right == null){
                return left;
            }
             node ans = new node(-1);
             node temp = ans;

            while (left != null && right != null){
                if (left.data < right.data){
                    temp.next = left;
                    temp = left;
                    left = left.next;
                }
                else {
                    temp.next = right;
                    temp = right;
                    right = right.next;
                }
            }
            while (left != null){
                temp.next = left;
                temp = left;
                left = left.next;
            }
            while (right != null){
                temp.next = right;
                temp = right;
                right = right.next;
            }
            ans = ans.next;
            return ans;
        }
        static node mergesort( node head){
        if (head == null || head.next == null){
            return  head;
        }
        //break the ll into 2 part-->
         node mid = getmid(head);

         node left = head;
         node right = mid.next;
        mid.next = null;

        //recursive call on both sides--->
        left = mergesort(left);
        right = mergesort(right);

            return merge(left , right);
    }
        static void display(node temp){
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    void add_data(int new_data){
    node new_node = new node(new_data);
    new_node.next = head;
    head = new_node;
    }

    public static void main(String[] args) {
        node result = null;
        MERGE_TWO_LL l1 = new MERGE_TWO_LL();
        MERGE_TWO_LL l2 = new MERGE_TWO_LL();

        l1.add_data(20);
        l1.add_data(10);
        l1.add_data(30);

        l2.add_data(40);
        l2.add_data(50);
        l2.add_data(60);
        System.out.println("all data of l1 --.");
      display(l1.head);
        System.out.println("all data of l2 --.");
      display(l2.head);

      l1.head = mergesort(l1.head);
      l2.head = mergesort(l2.head);

        result = merge(l1.head , l2.head);
     System.out.println("merge linked list is-->");
        display(result);
    }
}
