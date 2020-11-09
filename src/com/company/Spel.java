package com.company;

import java.util.Scanner;

public class Spel {

    private Scanner scanner = new Scanner(System.in);
    private int pointcounter = 0;

    /**
     * Med start metoden startas game metoden
     */
    public void start()
    { game(); }


    /**
     * Game metoden är själva spelet där hiitar man frågorna och svaren
     * användaren frågas och man ber användaren att mata in via terminalen
     * beroende på svaret räknar pointcounter antalet rätta svar till spelets slut
     */
    public void game(){
        System.out.println("vilken skostorlek har chris hemsworth");
        String svar = scanner.nextLine();
        if (svar.equals("46")){
            System.out.println("du hade rätt!");
            pointcounter++;
        }
        else{
            System.out.println("du hade fel!");
        }
        System.out.println("du har: " + pointcounter + " poäng \n\n\n");

        System.out.println("Vilket datum fyller kalle anka år?");
         svar = scanner.nextLine();
        if (svar.equals("9 juni")){
            System.out.println("du hade rätt!");
            pointcounter++;
            System.out.println("");
        }
        else{
            System.out.println("du hade fel!");
        }

        System.out.println("du har: " + pointcounter + " poäng \n\n\n");

        System.out.println(" Vilken färg har en banan");
         svar = scanner.nextLine();
        if (svar.equals("gul")){
            System.out.println("du hade rätt!");
            pointcounter++;
            System.out.println("");
        }
        else{
            System.out.println("du hade fel!");
        }
        System.out.println("du har: " + pointcounter + " poäng \n\n\n");

        System.out.println("Vilkeen stad är Tysklands huvudstad?");
        svar = scanner.nextLine();
        if (svar.equals("berlin")){
            System.out.println("du hade rätt!");
            pointcounter++;
            System.out.println("");
        }
        else{
            System.out.println("du hade fel!");
        }
        System.out.println("du har: " + pointcounter + " poäng \n\n\n");

        System.out.println("Vad heter viruset som har orsakat en pandemi i åren 2019-2020?");
        svar = scanner.nextLine();
        if (svar.equals("covid 19")){
            System.out.println("du hade rätt!");
            pointcounter++;
            System.out.println("");
        }
        else{
            System.out.println("du hade fel!");
        }
        System.out.println(" du fick sammanlagt " + pointcounter + " poäng \n\n\n");


    }

    /**
     *
     * @return här retuneras en boolean som används i Main metoden
     * för att fortsätta spelet eller avsluta spelet
     */
    public boolean endGame(){
        System.out.println("Thank you for playing");
        return false;
    }


}
