package com.company;

import java.util.Scanner;

public class EXIT_POINT_IN_2D_ARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int [n][m];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int direction = 0;
        //0 indicates east, 1 --> south , 2 --> 3 -->west, 4--> north
        int i = 0;
        int j = 0;

        while (true){
            direction = (direction+arr[i][j]) % 4;
            if (direction == 0){
                j++;
            }
            else if (direction == 1){
                i++;
            }
            else if (direction == 2){
                j--;
            }
            else if (direction == 3){
                i--;
            }
            if (i < 0){
                i++;
                break;
            }
            else if (j < 0){
                j++;
                break;
            }
            else if (i == arr.length){
                i--;
                break;
            }
            else if (j == arr[0].length){
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}
