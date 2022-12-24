package GameTicTacToe;

import java.util.Scanner;

import ArtificialIntelligence.BeginnerAI;

import java.util.Random;
import DataOfGame.Data;
import Player.MainPlayer;

public class Game {
    public static int userRole;
    public static int aiRole;

    static Random random = new Random();

    public static void begin() {

        Scanner scanner = new Scanner(System.in);
        userRole = getRole();
        aiRole = 2 - userRole;
        if (userRole == 1) {
            System.out.println("\r\nYou are X\r\nAI is O");
        }
        if (userRole == 0) {
            System.out.println("\r\nYou are O\r\nAI is X");
        }
        for (int i = 0; i < 9; i++) {
            Data.displayTicTacToe();
            System.out.println();
            if (Data.won()) {
                System.out.println("Congratulations:\r\nYou won!!!");
                scanner.close();
                return;
            } else if (Data.lose()) {
                System.out.println("Don't worry! You will get it next time.");
                scanner.close();
                return;
            }
            if (i % 2 == 0)
                MainPlayer.game();
            else
                BeginnerAI.game();
        }
        System.out.println("Well you neither won nor lost this match.\r\nIts a draw!");
        scanner.close();
    }

    public static int getRole() {
        return random.nextInt(2);
    }

    public static void main(String[] args) {
        begin();
        System.out.println("\r\nThank you for Playing!");
        System.out.println("Terminating the game!!!!!!!!!!!!!!!!!!");
    }
}
