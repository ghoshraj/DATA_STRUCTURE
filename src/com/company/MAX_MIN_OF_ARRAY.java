package com.company;

public class MAX_MIN_OF_ARRAY {
    public static void main(String[] args) {
        int a[] = new int[]{20,50,80,70,30,10,40};
        int max = 0;
        for(int i = 0; i<a.length-1; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        int min =a[0];
        for (int i = 0; i<a.length-1; i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("MAXIMUM ELEMENT OF THE ARRAY IS :" +max);
        System.out.println("MINIMUM ELEMENT OF THE ARRAY IS :" +min);
    }
}
