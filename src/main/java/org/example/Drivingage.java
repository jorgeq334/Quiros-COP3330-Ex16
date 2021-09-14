package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jorge Quiros
 */
public class Drivingage
{
    public static void main( String[] args )
    {
        Scanner input=new Scanner(System.in);
        System.out.print("What is your age? ");
        int age=input.nextInt();
        if(age<=0)
            System.out.println("Enter a valid age");
        else
        {
            int validAge= 16;
            System.out.println( age >= validAge ? "You are old enough to drive": "You are not old enough to drive");
        }
    }
}
