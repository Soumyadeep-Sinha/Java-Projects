package SnakesAndLadder;

import java.util.Scanner;

public class SnakesAndLadder {

    // defining colors
    public static final String BLUE_COLOR = "\u001B[34m";
    public static final String WHITE_COLOR = "\u001B[37m";
    public static final String RED_COLOR = "\u001B[31m";
    public static final String GREEN_COLOR = "\u001B[32m";
    public static final String YELLOW_COLOR = "\u001B[33m";

    public static void main(String[] args) {
        System.out.println("----------------- WELCOME TO SNAKES AND LADDER -------------------");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int player1 = 1;
        int player2 = 1;
        boolean flag1 = false;
        boolean flag2 = false;

        while (player1 != 100 || player2 != 100) {

            if (flag1) {
                System.out.println("player 1 chance (Enter y)");
                char val1 = 'y';
                int dice = diceRoll();
                if (val1 == 'y') {
                    player1 += dice;
                    player1 = hitSnake(player1);
                    player1 = hitLadder(player1);
                    System.out.println(GREEN_COLOR + "Dice gave : " + dice + WHITE_COLOR);
                    System.out.println();
                }
                if (player1 > 100) {
                    player1 -= dice;
                }
            }

            if (player1 == 100) {
                System.out.println(GREEN_COLOR + "Player 1 won" + WHITE_COLOR);
                break;
            }

            if (flag2) {
                System.out.println("player 2 chance (Enter y)");
                char val1 = 'y';
                int dice = diceRoll();
                if (val1 == 'y') {
                    player2 += dice;
                    player2 = hitSnake(player2);
                    player2 = hitLadder(player2);
                    System.out.println(GREEN_COLOR + "Dice gave : " + dice + WHITE_COLOR);
                    System.out.println();
                }
                if (player2 > 100) {
                    player2 -= dice;
                }
            }

            if (player2 == 100) {
                System.out.println(GREEN_COLOR + "Player 2 won" + WHITE_COLOR);
                break;
            }

            if (!flag1) {
                System.out.println("player 1 chance (Enter y)");
                char val1 = 'y';
                if (val1 == 'y') {
                    int dice = diceRoll();
                    if (dice == 6) {
                        flag1 = true;
                    }
                    System.out.println(GREEN_COLOR + "Dice gave : " + dice + WHITE_COLOR);
                    System.out.println();
                } else {
                    System.out.println("game ended as player 1 has quitted.");
                    break;
                }
            }

            if (player1 == 100) {
                System.out.println(GREEN_COLOR + "Player 1 won" + WHITE_COLOR);
                break;
            }

            if (!flag2) {
                System.out.println("player 2 chance (Enter y)");
                char val1 = 'y';
                if (val1 == 'y') {
                    int dice = diceRoll();
                    if (dice == 6) {
                        flag2 = true;
                    }
                    System.out.println(GREEN_COLOR + "Dice gave : " + dice + WHITE_COLOR);
                    System.out.println();
                } else {
                    System.out.println("game ended as player 2 has quitted.");
                    break;
                }
            }

            if (player2 == 100) {
                System.out.println(GREEN_COLOR + "Player 2 won" + WHITE_COLOR);
                break;
            }

            System.out.println(BLUE_COLOR + "position of player1 = " + player1);
            System.out.println(BLUE_COLOR + "position of player2 = " + player2 + WHITE_COLOR);
            System.out.println();
        }

        scanner.close();

    }

    public static int hitSnake(int position) {
        switch (position) {
            case 17:
                System.out.println(RED_COLOR + "Snake at 17! Moving back to 7." + WHITE_COLOR);
                return 7;
            case 64:
                System.out.println(RED_COLOR + "Snake at 64! Moving back to 60." + WHITE_COLOR);
                return 60;
            case 89:
                System.out.println(RED_COLOR + "Snake at 89! Moving back to 26." + WHITE_COLOR);
                return 26;
            case 95:
                System.out.println(RED_COLOR + "Snake at 95! Moving back to 75." + WHITE_COLOR);
                return 75;
            case 99:
                System.out.println(RED_COLOR + "Snake at 99! Moving back to 78." + WHITE_COLOR);
                return 78;
            default:
                return position;
        }
    }

    public static int hitLadder(int position) {
        switch (position) {
            case 4:
                System.out.println(YELLOW_COLOR + "Ladder at 4! Moving ahead to 14." + WHITE_COLOR);
                return 14;
            case 9:
                System.out.println(YELLOW_COLOR + "Ladder at 9! Moving ahead to 31." + WHITE_COLOR);
                return 31;
            case 28:
                System.out.println(YELLOW_COLOR + "Ladder at 28! Moving ahead to 84." + WHITE_COLOR);
                return 84;
            case 40:
                System.out.println(YELLOW_COLOR + "Ladder at 40! Moving ahead to 59." + WHITE_COLOR);
                return 59;
            case 51:
                System.out.println(YELLOW_COLOR + "Ladder at 51! Moving ahead to 67." + WHITE_COLOR);
                return 67;
            case 63:
                System.out.println(YELLOW_COLOR + "Ladder at 63! Moving ahead to 81." + WHITE_COLOR);
                return 81;
            default:
                return position;
        }
    }

    public static int diceRoll() {
        return (int) (Math.random() * 6) + 1;
    }
}
