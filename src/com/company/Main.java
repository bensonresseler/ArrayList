package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("namen.txt")))) {
            System.out.print("Geef naam (<RETURN> om te stoppen): ");
            String naam = scanner.nextLine();
            while (!naam.equals("")) {
                writer.println(naam);
                System.out.print("Geef naam (<RETURN> om te stoppen): ");
                naam = scanner.nextLine();
            }
        }

        System.out.println("Output: ");
        ArrayList<String> namen = new ArrayList<>();
        try (Scanner reader = new Scanner(new BufferedReader(new FileReader("namen.txt")))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                namen.add(line);
            }
            Collections.sort(namen);
            for (String n : namen) {
                System.out.println(n);
            }
        }
    }
}
