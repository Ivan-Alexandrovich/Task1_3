package com.metanit;
/*Написать метод, принимающий на вход два числа, и проверяющий что их сумма
лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном
случае – false*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert 2 numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        boolean flag = Ex(a,b);
        //System.out.println(flag);
        if (flag == true) {
            System.out.println("Sum of 2 numbers is between 10 and 20");
        }
        else {
            System.out.println("Sum of 2 numbers is not between 10 and 20");
        }
    }



    public static boolean Ex(double a, double b) {
        double sum = a + b;
        boolean flag;
        if ((sum >= 10) & (sum <= 20)) {
            flag = true;
            //System.out.println("it works");
        }
        else {
            flag = false;
            //System.out.println("it doesn't work");
        }
        return flag;
    }
}