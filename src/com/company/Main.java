package com.company;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Auto> autos = leesAutos(scanner);
        System.out.print("Geef nummerplaat die gezocht moet worden: ");
        String nummerplaat = scanner.nextLine();
        Auto auto = zoekAuto(autos, nummerplaat);
        if (auto != null) {
            System.out.printf("De bestuurder van de auto met nummerplaat %s is %s%n", auto.getNummerplaat(), auto.getBestuurder());
        } else {
            System.out.println("Nummerplaat is niet gevonden.");
        }
    }


    private static ArrayList<Auto> leesAutos(Scanner scanner) {
        ArrayList<Auto> autos = new ArrayList<>();

        System.out.print("Geef bestuurder (<RETURN> om te stoppen): ");
        String bestuurder = scanner.nextLine();

        while (!bestuurder.equals("")) {
            System.out.print("Geef nummerplaat: ");
            String nummerplaat = scanner.nextLine();

            Auto a = new Auto(bestuurder, nummerplaat);
            autos.add(a);

            System.out.print("Geef bestuurder (<RETURN> om te stoppen): ");
            bestuurder = scanner.nextLine();
        }
        return autos;
    }

    private static Auto zoekAuto(ArrayList<Auto> autos, String nummerplaat) {
        String n;
        for (int i = 0; i < autos.size(); i++) {
            Auto a = autos.get(i);
            n = a.getNummerplaat();
            if (n.equals(nummerplaat)) return a;
        }
        return null;
    }
}