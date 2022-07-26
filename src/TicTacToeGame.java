import java.util.Scanner;

/*
* Printing a game Board for TicTacToe Game
* Board of char[] of size 10 and assign empty space to each element
* Taking input from user to make the position in the board
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
        int position = sc.nextInt();

        System.out.println(position);

    }
    public static void printBoard(char [][] gameBoard){

        for(char[] row : gameBoard){
            for( char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
