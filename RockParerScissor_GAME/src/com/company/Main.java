package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-*");
        System.out.println("\t\t\t\t WELCOME TO ROCK-PAPER-SCISSOR GAME");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tDeveloper --> Kshitij Sanjay Hadke");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-**-*-*-*-*-*-*-*-*");

        System.out.println("\tEnter 0 for ROCK.....");
        System.out.println("\tEnter 1 for PAPER.....");
        System.out.println("\tEnter 2 for SCISSOR.....");


        int computer_ch;
        int computerWon = 0;
        int my_ch;
        int me = 0;
        int game = 1;

        while (game<=5) {

                System.out.print("\n------ Enter Your Choice ---> ");
                Random ran = new Random();
                computer_ch = ran.nextInt(2);
                    my_ch = sc.nextInt();

                switch (my_ch) {
                    case 0 -> System.out.println("\t\tYOU chose ROCK......");
                    case 1 -> System.out.println("\t\tYOU chose PAPER......");
                    case 2 -> System.out.println("\t\tYOU chose SCISSOR......");
                    default -> System.out.println("ERROR....Invalid Choice!!!!!");
                }

                switch (computer_ch) {
                    case 0 -> System.out.println("\t\tCOMPUTER chose ROCK......");
                    case 1 -> System.out.println("\t\tCOMPUTER chose PAPER......");
                    case 2 -> System.out.println("\t\tCOMPUTER chose SCISSOR......");
                    default -> System.out.println("ERROR....Invalid Choice!!!!!");
                }

                if (computer_ch == my_ch) {
                    System.out.println("\t\t\t\nMATCH TIE.....");
                    System.out.println("-----------------------------------");
                } else if (computer_ch == 0 && my_ch == 1) {
                    System.out.println("\t\t\t\nYOU WON !!!!");
                    me++;
                    System.out.println("-----------------------------------");
                } else if (computer_ch == 0 && my_ch == 2) {
                    System.out.println("\t\t\t\nCOMPUTER WON !!!!");
                    computerWon++;
                    System.out.println("-----------------------------------");
                } else if (computer_ch == 1 && my_ch == 0) {
                    System.out.println("\t\t\t\nCOMPUTER WON !!!!");
                    computerWon++;
                    System.out.println("-----------------------------------");
                } else if (computer_ch == 1 && my_ch == 2) {
                    System.out.println("\t\t\t\nYOU WON !!!!");
                    me++;
                    System.out.println("-----------------------------------");
                } else if (computer_ch == 2 && my_ch == 0) {
                    System.out.println("\t\t\t\nYOU WON !!!!");
                    me++;
                    System.out.println("-----------------------------------");
                } else if (computer_ch == 2 && my_ch == 1) {
                    System.out.println("\t\t\t\nCOMPUTER WON !!!!");
                    computerWon++;
                    System.out.println("-----------------------------------");
                }

                if (game == 5) {
                    break;
                }

                game++;

        }
        System.out.println("\n----------------------------------------------------");

        System.out.println("\t\t\t\tSCORE BOARD");
        System.out.println("\n\t---> COMPUTER " + " = " + computerWon);
        System.out.println("\n\t----> YOU " + " = " + me);

        System.out.println("\n----------------------------------------------------");

        System.out.println("\t\tRESULT OF THIS GAME IS.......");
        if (computerWon > me)
        {
            System.out.println("\n\t\tSORRY!!! COMPUTER HAS WON THIS GAME.☹☹☹☹");
        }
        else if (computerWon == me)
        {
            System.out.println("\n\t\tTHE GAME IS TIE.");
        }
        else
        {
            System.out.println("\n\t\tCONGRATULATIONS !!! YOU HAVE WON THIS GAME.");
        }
    }
}
