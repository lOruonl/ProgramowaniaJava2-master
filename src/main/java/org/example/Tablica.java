package org.example;

import java.util.ArrayList;

public class Tablica {
    public static ArrayList<Integer> tab = new ArrayList<>();
    public static ArrayList<Integer> tablica = new ArrayList<>();
    /*        int[][] tablica = new int[10][10];

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = (j + 1) * (i + 1);
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
            }
         */
    public static void tablicaMnozenia(){
        for (int i = 1; i <= 10 ; i++) {
            tab.add(i);
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablica.add(tab.get(i)*tab.get(j));
                System.out.print(tablica.get(tablica.size()-1) + " ");
            }
            System.out.println();
//            tablica.clear();
        }
    }
}

