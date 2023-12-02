package org.example;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//
//        for (int i = 1; i <= 10; i++) {
//            if(i % 2 == 0)
//                System.out.println(i);
//        }
//
//        int i = 1;
//        while(i <= 20)
//            if(i % 3!= 0)
//                System.out.println(i);
////
//        for (int i = 1; i <= 20; i++) {
//            if(i % 2 == 0)
//                System.out.println(i + " parzysta");
//            else
//                System.out.println(i + " nieparzysta");
//        }
//
//        int i = 1;
//        while(i <= 20){
//
//            String resolt = (i % 2 == 0) ? i + " parzysta" : i + " nieparzysta";
//            System.out.println(resolt);
//
//            i++;
//        }
//        int i = 1;
//        do {
//
//            String resolt = (i % 2 == 0) ? i + " parzysta" : i + " nieparzysta";
//            System.out.println(resolt);
//
//            i++;
//        }
//        while(i <= 20);
//
//        int[][] tablica = new int[10][10];
//
//        for (int i = 0; i < tablica.length; i++) {
//            for (int j = 0; j < tablica[i].length; j++) {
//                tablica[i][j] = (j + 1) * (i + 1);
//                System.out.print(tablica[i][j] + " ");
//            }
//            System.out.println();

//        }
//
//        for (int i = 1; i <= 20 ; i++) {
//            if(i % 2 == 0)
//                continue;
//            System.out.println(i);
//
//        }
//
//        int i = 1;
//        while (i <= 20){
//            if (i % 2 == 0)
//                continue;
//
//            System.out.println(i);
//
//            i++;
//        }
//
//        for (int i = 1; i <= 30 ; i++) {
//
//            if(i % 3 != 0)
//                System.out.print(i + " ");
//
//        }
//

//        for (int i = 1; i <= 30 ; i++) {
//
//            if(i % 3 == 0)
//                continue;
//
//            System.out.print(i + " ");
//
//        }


//        for (int i = 1; i <= 30 ; i++) {
//            if(i % 3 == 0)
//                break;
//            System.out.print(i + " ");
//        }
//
//        for (int i = 1; i <= 100; i++) {
//
//            if (i % 4 == 0) {
//                if ((i % 8 == 0) || (i % 10 == 0))
//                    continue;
//                System.out.print(i + " ");
//            }
////
//        }
        Scanner scan = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//
//
//            int liczba = scan.nextInt();
//
//            if(liczba % 2 == 0)
//                System.out.println(liczba + " jest parzysta");
//            else
//                System.out.println(liczba + " jest nieparzysta");
//
//
//        }


//        String[] string = new String[3];
//        for (int i = 0; i < 3; i++) {
//            string[i] = scan.nextLine();
//
//        }
//        System.out.println(string[0] + " " + string[1] + " " + string[2]);
//
//        int[] arr = new int[10];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 100 + i + 1;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        int[] arr = new int[10];
//
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i] = (i + 1) * 10;
//        }
//                for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }


//        boolean[] arr = new boolean[20];
//
//        for (int i = 0; i < arr.length; i++) {
//            if(i % 2 == 0)
//                arr[i] = true;
//            else
//                arr[i] = false;
//        }
//        System.out.println(Arrays.toString(arr));

//        int[] arrInt = new int[100];

//        for (int i = 0; i <= 10; i++) {
//            switch (i){
//                case  0 -> {
//                    for (int j = 0; j < arrInt.length; j += 10) {
//                        arrInt[j] = 0;
//                    }
//                }
//
//                case  1 -> {
//                    for (int j = 1; j < arrInt.length; j += 10) {
//                        arrInt[j] = 1;
//                    }
//                }
//                case  2 -> {
//                    for (int j = 2; j < arrInt.length; j += 10) {
//                        arrInt[j] = 2;
//                    }
//                }
//                case  3 -> {
//                    for (int j = 3; j < arrInt.length; j += 10) {
//                        arrInt[j] = 3;
//                    }
//                }
//                case  4 -> {
//                    for (int j = 4; j < arrInt.length; j += 10) {
//                        arrInt[j] = 4;
//                    }
//                }
//                case  5 -> {
//                    for (int j = 5; j < arrInt.length; j += 10) {
//                        arrInt[j] = 5;
//                    }
//                }
//                case  6 -> {
//                    for (int j = 6; j < arrInt.length; j += 10) {
//                        arrInt[j] = 6;
//                    }
//                }
//                case  7 -> {
//                    for (int j = 7; j < arrInt.length; j += 10) {
//                        arrInt[j] = 7;
//                    }
//                }
//                case  8 -> {
//                    for (int j = 8; j < arrInt.length; j += 10) {
//                        arrInt[j] = 8;
//                    }
//                }
//                case  9 -> {
//                    for (int j = 9; j < arrInt.length; j += 10) {
//                        arrInt[j] = 9;
//                    }
//                }
//            }
//        }
//            System.out.print(Arrays.toString(arrInt));
//        for (int i = 0; i < arrInt.length/10; i++) {
//            for (int j = 0 + i; j < arrInt.length; j += 10) {
//                arrInt[j] = i;
//
//            }
//        }
//        System.out.println(Arrays.toString(arrInt));

//        char[] chars = new char[26];
//
//            for (char c = 'a'; c <= 'z'; c++) {
//                    chars[c - 'a'] = c;
//            }
//        System.out.println(Arrays.toString(chars));

//        boolean isExit = true;
//        int result;
//        while (isExit) {
//            System.out.println("Wpisz pierszom liczbe: ");
//            int a = scan.nextInt();
//            System.out.println("Wpisz druga liczbe: ");
//            int b = scan.nextInt();
//            System.out.println("wybierz znak arytmetyczny: [+, -, *, /, % or X, x - exit]");
//            String arefmetik = scan.next();
//
//            switch (arefmetik) {
//                case "+" -> {
//                    result = a + b;
//                    System.out.println(a + " " + arefmetik + " " + b + "=" + result);
//                }
//                case "-" -> {
//                    result = a - b;
//                    System.out.println(a + " " + arefmetik + " " + b + "=" + result);
//                }
//                case "*" -> {
//                    result = a * b;
//                    System.out.println(a + " " + arefmetik + " " + b + "=" + result);
//                }
//                case "/" -> {
//                    result = a / b;
//                    System.out.println(a + " " + arefmetik + " " + b + "=" + result);
//                }
//                case "%" -> {
//                    result = a % b;
//                    System.out.println(a + " " + arefmetik + " " + b + "=" + result);
//                }
//                case "X" -> isExit = false;
//
//                case "x" -> isExit = false;
//            }
//        }

 Palindrom palindrom = new Palindrom();

    palindrom.printMessage();
    }
}




