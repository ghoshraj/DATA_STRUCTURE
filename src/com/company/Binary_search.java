package com.company;

import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        int n , i , item , end , start , c =0;
        int[]a;
        Scanner sc = new Scanner(System.in);
        System.out.println("HOW MANY ELEMENT DO YOU WANT TO ENTER :");
        n = sc.nextInt();
        a = new int[n];

        System.out.println("ENTER ELEMENTS:");
        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.println("ENTER THE ITEM TO FIND :");
        item = sc.nextInt();

            start = 0 ;
            end = n-1;
            while (start<= end) {
                int mid = (start + end) / 2;
                if (item==a[mid]){
                    c++;
                   break;
                }
                else if(item>a[mid]){
                    start = mid+1;
                }
                else if (item<=a[mid]){
                    end = mid-1;
                }
            }
            if (c>0){
                System.out.println("ITEM FOUND"+ i);
            }
            else {
                System.out.println("ITEM DOES NOT FOUND !!!");
            }
        }
    }
