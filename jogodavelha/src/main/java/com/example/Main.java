package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;

        Scanner sc = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);
            System.out.println("Player " + player + " enter: ");
            int row = sc.nextInt();
            int col = sc.nextInt();    
            
            if(board[row][col] == ' '){
                board[row][col] = player;
                gameOver = haveWon(board, player);
                if (gameOver) {
                    System.out.println("Player " + player + " has won: ");
                } else {
                    if (player == 'X') {
                        player = 'O';
                    } else {
                        player = 'X';  
                    }
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    public static boolean haveWon(char[][] board, char player){

    }

    public static void printBoard(char[][] board){

    }
}