/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Faiz Ahmed
 */

import java.util.*;
public class compound {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double principal, rate, year, investment, times;
        System.out.println("Enter the principal:");
        principal = sc.nextDouble();
        System.out.println("Enter the rate of interest:");
        rate = sc.nextDouble() / 100.0;
        System.out.println("Enter the number of years:");
        year = sc.nextDouble();
        System.out.println("What is the number of times the interest is compounded per year?");
        times = sc.nextDouble();
        investment = principal * Math.pow((1 + (rate)/times), (times * year));
        System.out.println(String.format("$%.2f invested at %.2f%% for %.0f years compounded, %.0f times per year is $%.2f.", principal,rate*100,year,times,investment));
    }
}