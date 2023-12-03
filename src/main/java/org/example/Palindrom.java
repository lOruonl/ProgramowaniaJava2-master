package org.example;

import java.util.Scanner;

public class Palindrom {
    public static int num;
    public static void writeNumbers() {
        var scan = new Scanner(System.in);
        System.out.print("Впишите своё число: ");
        num = scan.nextInt();
    }
    public static void printMessage(){
        System.out.println("Вас приведствует программа для проверки является ли число палиндромом!");
        writeNumbers();

        if (isPalindrom(num))
            System.out.println(num + " - Является таковым числом");
        else
            System.out.println(num + " - Не является таковым числом");
    }

    public static boolean isPalindrom(int x){
        int number = x;
        int module;
        int renumber = 0;

        while ( x > 0){
            module = x % 10;
            renumber = renumber * 10 + module;
            x /= 10;
        }
        return number == renumber;
    }
}
