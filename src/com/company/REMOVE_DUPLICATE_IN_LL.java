package com.company;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class REMOVE_DUPLICATE_IN_LL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(10);
        ll.add(40);
        ll.add(20);
        ll.add(50);
        ll.add(10);
        ll.add(20);
        ll.add(60);
        ll.add(30);
        LinkedHashSet<Integer> l = new LinkedHashSet<>();
        for (int i = 0; i < ll.size(); i++)
            l.add(ll.get(i));
        System.out.println(l);
    }
}
