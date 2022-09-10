package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PREFIX_CONVERSION {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> vs = new Stack<>();
        Stack<String> is = new Stack<>();
         Stack<String> ps = new Stack<>();

        for (int i = exp.length() - 1;i >= 0; i-- ){
            char ch = exp.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*'  || ch == '/') {
                int v1 = vs.pop();
                int v2 = vs.pop();
                int val = operation(v1 , v2 , ch);
                vs.push(val);

               String inv1 = is.pop();
                String inv2 = is.pop();
                String inval = "(" + inv1 + ch + inv2 + ")";
                vs.push(Integer.valueOf(inval));

                String pv1 = ps.pop();
                String pv2 = ps.pop();
                String pval = pv1 + pv2 + ch;
                vs.push(Integer.valueOf(pval));

            }
            else {
                vs.push(ch - '0');
                is.push(ch + " ");
                ps.push(ch + " ");
            }
        }
        System.out.println(vs.pop());
        System.out.println(is.pop());
        System.out.println(ps.pop());
    }
    public static int operation(int v1 , int v2 , char op){
        if (op == '+'){
            return  v1 + v2;
        }
        else if (op == '-'){
            return  v1 - v2;
        }
        else if (op == '*'){
            return  v1 * v2;
        }
        else {
            return  v1 / v2;
        }
    }
}
