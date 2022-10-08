package com.company;

public class MERGE_SORTED_LL {
   static class node{
       int data;
       node next;
       node(int data){
           this.data = data;
           this.next = null;
       }
    }
    node head = null;

   //insert data in ll function-->
   void add_data(int new_data){
       node new_node = new node(new_data);
       new_node.next = head;
       head = new_node;
   }

   //find mid value of the ll-->
   public static node getmid(node head){
       if (head == null){
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
   //sorted the list-->
   node merge(node left , node right){
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

   node mergesort(node head){
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

       node result = merge(left , right);
       return result;
   }

   //display the ll-->
   void display(node temp){
       while (temp != null){
           System.out.println(temp.data);
           temp = temp.next;
       }
   }
    public static void main(String[] args)
    {
        MERGE_SORTED_LL li = new MERGE_SORTED_LL();
       li.add_data(10);
       li.add_data(20);
       li.add_data(50);
       li.add_data(30);
       li.add_data(60);
       li.add_data(40);


        li.head = li.mergesort(li.head);
        System.out.print("\n Sorted Linked List is: \n");
        li.display(li.head);
    }
}
