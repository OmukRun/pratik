package Musty.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // Write a Java program to convert temperature from Fahrenheit to Celsius degree.

        // formula

        // c = (f-32)*5/9

        Scanner sc = new Scanner(System.in);
        System.out.println("F değeri : ");
        double f = sc.nextDouble();
        System.out.println("C değeri : "+ ((f - 32) * 5) / 9);







    }

}
