package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class STOCK_SPAM {
    public static void display(int[]a){
        StringBuilder sb = new StringBuilder();

        for (int val : a){
            sb.append(val + " \n ");
        }
        System.out.println(sb);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int[] nge = solve(a);
        display(nge);
    }
    public static int[] solve(int[] arr) {
        int[] spam = new int[arr.length];
        Stack<Integer>st = new Stack<>();
        st.push(0);
        spam[0] = 1;

        for (int i = 1; i <arr.length; i++){
            while (st.size()> 0 && arr[i] > arr[st.peek()]){
                st.pop();
            }
            if (st.size() == 0){
                spam[i] = i +1;
            }
            else {
                spam[i] = i - st.peek();
            }
            st.push(i);
        }

        return spam;
        }
    }

