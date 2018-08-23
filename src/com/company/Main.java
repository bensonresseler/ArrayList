package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namen = new ArrayList<>();
        System.out.print("Geef naam (<RETURN> om te stoppen): ");
        String naam = scanner.nextLine();
        while(!(naam.equals(""))){
            namen.add(naam);
            System.out.print("Geef naam (<RETURN> om te stoppen): ");
            naam = (scanner.nextLine());
        }
        Collections.sort(namen);
        for(String n: namen){
            System.out.println(n);
        }    }
}
