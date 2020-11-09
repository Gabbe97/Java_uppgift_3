package com.company;
/**
 * Om använaren skriver start
 * Starta Spelet
 * om användaren skriver stop avsluta spelet
 * ge användaren frågor som han ska besvara
 * om han svarar rätt ge honom poäng
 * om han svarar fel visa att han har fel, avsluta spelet och visa honom poängen han har fått
 * när användaren har besvarat alla frågor rätt visa hans poäng och börja om
 * eller avsluta med stop
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean active = true;
        Scanner scanner = new Scanner(System.in);

        Spel skohorn = new Spel();

        while (active) {
            System.out.println("Välkommen till Frågestunden!");
            System.out.println("För att avsluta programmet skriv stop ");
            System.out.println("Start för att börja spela");


            String svar = scanner.nextLine();
            if (svar.equals("stop")) {
                active = skohorn.endGame();
            }

            if (svar.equals("start")) {
                skohorn.start();
            }

        }


    }
}