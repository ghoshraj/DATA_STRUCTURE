package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class LCQS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer , Boolean> hm = new HashMap<>();

        for (int val : arr){
            hm.put(val , true);
        }

        for (int val : arr){
            if (hm.containsKey(val - 1)){
                hm.put(val , false);
            }
        }

        int msp = 0;
        int ml = 0;
        for (int val : arr){
            if (hm.get(val) == true){
                int tl = 1;
                int tsp = val;

                while (hm.containsKey(tsp  + tl)){
                    tl ++;
                }
                if (tl > ml){
                    msp = tsp;
                    ml = tl;
                }
            }
        }
        for (int i = 0; i < ml; i++){
            System.out.println(msp + i);
        }
    }
}
