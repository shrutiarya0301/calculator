package com.programs;

import java.util.Scanner;

//program to make calculator ('+','-','*','/')
public class calculator {
    public static void main(String []args){
        double result = 0.0;
        Scanner s = new Scanner(System.in);
        System.out.print(" enter num1 operator num2(3 + 2):");
        double num1 = s.nextDouble();
        char op= (s.next()).charAt(0);
        double num2 = s.nextDouble();
        if(op=='+'||op=='-'||op=='*'||op=='/') {
            if (op == '+')
                result = num1 + num2;
            else if (op == '-')
                result = num1 - num2;
            else if (op == '*')
                result = num1 * num2;
            else if (op == '/')
                result = num1 / num2;

            System.out.println(result);
        }
        else
            System.out.println(" invalid operator");

    }
}

