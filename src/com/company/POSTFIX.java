package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class POSTFIX {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> opnds = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                operator.push(ch);
            } else if (Character.isDigit(ch)) {
                opnds.push(ch - '0');
            } else if (ch == ')') {
                while (operator.peek() != '(') {
                    char operators = operator.pop();
                    int v1 = opnds.pop();
                    int v2 = opnds.pop();
                    char opv = (char) operation(v1, v2, operators);
                    opnds.push((int) opv);
                }
                operator.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (operator.size() > 0 && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek())) {
                    char operators = operator.pop();
                    int v1 = opnds.pop();
                    int v2 = opnds.pop();
                    char opv = (char) operation(v1, v2, operators);
                    opnds.push((int) opv);
                }
                operator.push(ch);
            }
        }
        while (operator.size() != 0) {
            char operators = operator.pop();
            int v1 = opnds.pop();
            int v2 = opnds.pop();
            char opv = (char) operation(v1, v2, operators);
            opnds.push((int) opv);
        }
        System.out.println(opnds.peek());
    }
    public static int precedence(char operator){
        if (operator == '+') {
            return 1;
        }
        else if(operator == '-'){
            return 1;
        }
        else if (operator == '*'){
            return 2;
        }
        else {
            return 2;
        }
    }
    public static int operation(int v1, int v2 , char operator){
        if (operator == '+') {
            return v1 + v2;
        }
        else if(operator == '-'){
            return v1 - v2;
        }
        else if (operator == '*'){
            return v1 * v2;
        }
        else {
            return v1 / v2;
        }
    }
}
