package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class FIND_ELEMENT_IN_LL {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);
        l.add(70);
        //find the mid value of the linkedlist--->
         int mid = l.size()/2;
         System.out.println("mid value of the ll is -->"+l.get(mid));

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ELEMENT -->");
        int element = sc.nextInt();
        int ans = -1;
        for (int i = 0; i < l.size();i++){
            int lElement = l.get(i);
            if (lElement == element){
                ans = i;
                break;
            }
        }
        if (ans == -1){
            System.out.println("element not found");
        }
        else {
            System.out.println("element found in" +" " + ans +" " + "index" + " "+ "and the valye is " + " " + l.get(ans));
        }
        //print the all next element--->
        for (int i = ans + 1; i < l.size(); i++){
            System.out.println("next elements are " + " " +l.get(i));
        }
    }
}
