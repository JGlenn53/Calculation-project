package com.FunGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to rock paper scissors! \n you are playing against the cpu");
        System.out.println("Choose your option!");
        System.out.println("[1] Rock \n[2] Paper \n[3] Scissors");
        System.out.print("What is your choice? ");
        int userChoice = userInput.nextInt();

        Random random = new Random();
        int cpuInput = random.nextInt(2);
        int rock = 0;
        int paper = 1;
        int scissors = 2;
        System.out.println(cpuInput);
        if (cpuInput == (userChoice - 1)) {
            System.out.println("You tied");
        }
        else if (cpuInput == 0 && userChoice == 2 ) {
            System.out.println("you won");
        }











    }
}
