package com.company;
public class CalculatePower {

        public static int power ( int x, int n){

            //Defining the Base case for n=0
            if (n == 0) {
                return 1;
            }

            //Defining the assumed hypothesis
            int smallOutput = power(x, n - 1);

            //Defining the final induction
            int output = x * smallOutput;
            return output;
        }
    }
