import java.util.Random;
import java.util.Scanner;

/*
* Printing a game Board for TicTacToe Game
* Board of char[] of size 10 and assign empty space to each element
* Taking input from user to make the position in the board
* Taking random input for cpu player
* */
public class TicTacToeGame {


    public static void main(String[] args) {
        char[][] gameBoard = {
                {' ','|',' ','|',' '},
                {'_','+','_','+','_'},
                {' ','|',' ','|',' '},
                {'_','+','_','+','_'},
                {' ','|',' ','|',' '}
        };
        printBoard(gameBoard);

        // Taking input for position in board
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position for board between 1-9: ");
        int playerPosition = sc.nextInt();

        System.out.println("Player position is: " +playerPosition);

        placeXO(gameBoard, playerPosition, "player");

        // Taking random value for cpu Player position in board
        Random rm = new Random();
        int cpuPosition = rm.nextInt(9) + 1;
        placeXO(gameBoard, cpuPosition, "cpu");
        System.out.println("CPU position is : " +cpuPosition);

    }
    // Method to print the board
    public static void printBoard(char [][] gameBoard){

        for(char[] row : gameBoard){
            for( char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    // Method to Place X in Board by selecting the position by User
    public static void placeXO(char [][] gameBoard, int position, String user) {
        char symbol = ' ';
        if (user.equals("player")){
            symbol = 'X';
        }else if (user.equals("cpu")){
            symbol = 'O';
        }

        switch (position){
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;

        }

    }
}
