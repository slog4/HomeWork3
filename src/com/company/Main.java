package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        task1();
//        task2();
        task3();

//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
//        task11_rectangle();
//        task11_right_triangle();
//        task11_equilateral_triangle();



    }

    private static void task3() {
        long x=0;
        int a=0,b=0,counterA=0,counterB=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число a: ");
        a=scanner.nextInt();
        System.out.println("Введите число b: ");
        b=scanner.nextInt();
        System.out.println("Введите число в котором будем искать: ");
        x=scanner.nextLong();
        do {
            if(x % 10 == a){
                counterA++;
            }else if( x%10 == b){
                counterB++;
            }
            x/=10;
        }while (x==0);
        if (counterA > counterB) {
            System.out.println("Верно");
        } else {
            System.out.println("Не верно");
        }
    }

    private static void task1() {
        double a=0,b=0,c=0;
        System.out.println("|Значение X| Значение функции а)|Значение функции б)|Значение функции в)|");
        for(int i=0;i<20;i++){
            a= i - Math.sin(i);
            b=Math.pow(Math.sin(i),2);
            c= 2*Math.cos(i)-1;

            System.out.printf ("|%10d|%20f|%19f|%19f| \n",i,a,b,c);
        }
    }

    private static void task2() {
        double y=0,x=0;
        int a=3, b=-5;
        for (x =1; x<= 5; x+=0.5){
            y= a* Math.pow(x,2)+b;
            System.out.printf("Для значения x = %5f, y = %5f \n",x,y);
        }
    }

    private static void task5() {
        double x = 0,denuminator =1, z = 0;
        for (int i = 1; i<=15; i++){
            x = Math.random()*10;
            denuminator = denuminator *i;
            z += (i+x)/denuminator;
        }
        System.out.println(z);
    }

    private static void task6() {
        int x,y,k;
        for (x=1;x<=30;x++){
            for (y=x;y<=30;y++) {
                  for (k=1;k<=30;k++) {
                      if ((Math.pow(x, 2) + Math.pow(y, 2)) == Math.pow(k, 2)) {
                          System.out.println("X= " + x + " Y= " + y + " K= " + k);
                      }
                  }
            }

          }
    }

    private static void task7() {
        int a = 100;
        int counter =0;
        int x= 19;
        do {
            a++;
            if((a % 19) == 0){
                System.out.print(a+ ", ");
                counter++;
            }
        } while (counter < 15);
    }

    private static void task8() {
        int a = 500;
        int x = 13;
        int y = 17;
        int counter = 0;
        do {
            a++;
            if((a % x) == 0 && (a % y) == 0) {
                System.out.print(a+", ");
                counter++;
            }
        }while (counter < 20);
    }

    private static void task9() {
        int a=2;
        int b=4;
        int d = b-a;
        int counter = 0;
        int sum = a;
        System.out.println("Введите чило: ");
        Scanner scanner = new Scanner(System.in);
        int z = scanner.nextInt();
        while (sum < z) {
            a+=d;
            sum +=a;
            counter++;
        }
        System.out.printf("Число слогаемых: %d,сумма равна: %d, последнее слогаемое: %d", counter,sum,a);
    }

    private static void task10() {
        int x,y,d;
        x=1;
        y=5;
        d=y-x;
        int progression = x;
        int sum=0;
        for(int i=0;i<10;i++){
            sum +=progression;
            System.out.printf(" %s "+progression, progression==x?"":" + ");
            progression+=d;

        }
        System.out.println(" = "+ sum);
    }

    private static void task11_equilateral_triangle() {
        int row = 10, colums = 11;
        int z = 0;
        String empty = "  ", s = "* ";
        for (int i = 0; i < row; i++) {
            int x = 0;
            while (x < row - i) {
                System.out.print(empty);
                x++;
            }
            for (int j = 0; j < (colums - (row - i)) + (colums - (row - i) - 1); j++) {
                System.out.print("* ");
            }

            System.out.println(" ");
        }
    }


    private static void task11_right_triangle() {
        int row = 10, colums = 10;
        for (int i = 0; i < row; i++) {
            ;
            for (int j = 0; j < colums - (row - i); j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    private static void task11_rectangle() {
        int row = 5, colums = 10;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= colums; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
