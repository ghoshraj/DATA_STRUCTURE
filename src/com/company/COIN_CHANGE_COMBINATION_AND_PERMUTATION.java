package com.company;

import java.util.Scanner;

public class COIN_CHANGE_COMBINATION_AND_PERMUTATION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the number--->");
        int num = sc.nextInt();

        int[] dp = new int[num + 1];
        dp[0] = 1;

        //combination function --->
        for (int i = 0; i < arr.length; i++){
            for (int j = arr[i]; j < dp.length; j++){
                dp[j] += dp[j - arr[i]];
            }
        }

        //permutation function --->
        for (int i = 1; i <= num; i++){
            for (int coin : arr){
               if (coin <= i){
                   int ans = i - coin;
                   dp[i] += dp[ans];
               }
            }
        }
        System.out.println("total permutation possible -->" +dp[num]);
        System.out.println("total combination possible -->" + dp[num]);
    }
}
