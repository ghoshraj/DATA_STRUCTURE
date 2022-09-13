package com.company;

import java.util.LinkedList;

public  class IS_A_LINKEDLIST_PALINDROME {
    public static void main(String args[]) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(20);
        l.add(10);
        int i;
        int j;
        for (j = l.size() - 1 , i = 0 ;i < j ; j-- , i++) {
            if (l.get(i) != l.get(j)){
                break;
                }
            }
            if (i < j) {
                System.out.println("number is not palindrome");
            }
            else {
                System.out.println("number is  palindrome");
            }
    }
}
