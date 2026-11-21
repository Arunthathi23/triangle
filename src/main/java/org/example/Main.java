package org.example;

import java.util.Scanner;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter base;");
            double base=sc.nextDouble();
            System.out.println("Enter height;");
            double height=sc.nextDouble();
            double area=0.5*base*height;
            System.out.println("Area:"+area);



    }
}