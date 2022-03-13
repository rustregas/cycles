package com.company;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int i = 0;

        while (i < 10){
            i++;
            System.out.print(i+" ");
        }

        System.out.println();

        for(; i > 0; i--) {
            System.out.print(i+" ");
        }
    }

    public static void task2() {
        System.out.println();

        for(int friday = 4; friday < 32; friday = friday+7){
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void task3() {
        int currentYear = 2022;
        int minYear = currentYear - 200;
        int maxYear = currentYear + 100;

        for(int j = 0; j <= maxYear; j = j+79) {
            if(j > minYear)
                System.out.println(j);
        }
    }

    public static void task4() {
        for (int j = 1; j < 31; j++) {
            if (j % 5 == 0) {
                if (j % 3 == 0) {
                    System.out.println(j + ": " + "ping pong");
                } else {
                    System.out.println(j + ": " + "pong");
                }
            } else {
                if (j % 3 == 0) {
                    System.out.println(j + ": " + "ping");
                } else {
                    System.out.println(j + ": " + "");
                }
            }
        }
    }

    public static void task5() {
        int firstValue = 0;
        int secondValue = 1;
        int nextValue;
        int cntNumbers = 8;

        for (int j = 0 ; j < 2+cntNumbers; j++){
            System.out.print(firstValue+" ");
            nextValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = nextValue;
        }
    }

}
