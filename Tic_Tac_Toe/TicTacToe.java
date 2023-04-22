package Tic_Tac_Toe;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("\u001B[35m"+"\n--- TIC TAC TOE ---\n"+"\u001B[37m");

        char[][] arr = { { '#', '#', '#' }, { '#', '#', '#' }, { '#', '#', '#' } };
        Scanner input = new Scanner(System.in);

        System.out.print("\u001B[34m"+"choose (o or x) : "+"\u001B[37m");
        char p = input.next().charAt(0);

        if(p != 'o' && p != 'x'){
            while(p != 'o' && p != 'x'){
                System.out.print("\u001B[31m"+"Value Should be o or x try again : "+"\u001B[37m");
                p = input.next().charAt(0);
            }
        }
        
        char c = 'o';
        if (p == 'o') {
            c = 'x';
        }

        //randomised start
        int chance = (int)Math.floor(Math.random()*2);

        if(chance == 1){
            System.out.println("\u001B[34m" + "your chance");
            System.out.print("enter the row : ");
            int srow = input.nextInt();
            System.out.print("enter the column : ");
            int scolumn = input.nextInt();

            arr[srow][scolumn] = p;
            print(arr);
        }


        char[][] tic = arr; // to test for draw { { 'o', 'x', 'x' }, { 'x', 'x', 'o' }, { 'o', 'o', 'x' } };

        while (!playerWon(tic, p) && !computerWon(tic, c)) {

            //draw check
            if (isDraw(tic, p, c)) {
                System.out.println("game Draw");
                break;
            }

            // computer
            System.out.println("\u001B[32m"+"computer chance");
            int crow = (int) Math.floor(Math.random() * 3);
            int ccol = (int) Math.floor(Math.random() * 3);

            if (tic[crow][ccol] == '#') {
                tic[crow][ccol] = c;
            } else {
                while (tic[crow][ccol] != '#') {
                    crow = (int) Math.floor(Math.random() * 3);
                    ccol = (int) Math.floor(Math.random() * 3);
                }
                tic[crow][ccol] = c;
            }
            print(tic);
            System.out.println("");

            //game validations

            if (playerWon(tic, p)) {
                System.out.println("You won");
                break;
            }

            if (computerWon(tic, c)) {
                System.out.println("Computer won");
                break;
            }


            // Player
            System.out.println("\u001B[34m" + "your chance");

            System.out.print("enter the row : ");
            int prow = input.nextInt();
            System.out.print("enter the column : ");
            int pcol = input.nextInt();

            if (tic[prow][pcol] == '#') {
                tic[prow][pcol] = p;
            } else {
                while (tic[prow][pcol] != '#') {
                    System.out.println("\u001B[31m"+"Not a valid move try again"+"\u001B[37m");
                    System.out.print("enter the row : ");
                    prow = input.nextInt();
                    System.out.print("enter the column : ");
                    pcol = input.nextInt();
                }
                tic[prow][pcol] = p;
            }
            print(tic);

            //game validations

            if (playerWon(tic, p)) {
                System.out.println("You won");
                break;
            }

            if (computerWon(tic, c)) {
                System.out.println("Computer won");
                break;
            }
        }

        input.close();
    }

    public static void print(char[][] arr){
        for(char[] row : arr){
            System.out.println(Arrays.toString(row));
        }
    }

    public static boolean playerWon(char[][] arr, char p) {
        if (checkRows(arr, p)) {
            return true;
        }
        if (checkColumns(arr, p)) {
            return true;
        }
        if (checkDiagonals(arr, p)) {
            return true;
        }

        return false;
    }

    public static boolean computerWon(char[][] arr, char c) {
        if (checkRows(arr, c)) {
            return true;
        }
        if (checkColumns(arr, c)) {
            return true;
        }
        if (checkDiagonals(arr, c)) {
            return true;
        }

        return false;
    }

    public static boolean checkRows(char[][] arr, char x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2] && arr[i][0] == x && arr[i][1] == x
                    && arr[i][2] == x) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkColumns(char[][] arr, char x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i] && arr[0][i] == x && arr[1][i] == x
                    && arr[2][i] == x) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkDiagonals(char[][] arr, char x) {
        if (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2] && arr[0][0] == x && arr[1][1] == x && arr[2][2] == x) {
            return true;
        }

        if (arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0] && arr[0][2] == x && arr[1][1] == x && arr[2][0] == x) {
            return true;
        }

        return false;
    }

    public static boolean isDraw(char[][] arr, char p, char c) {
        if(isfull(arr) && !playerWon(arr, p) && !computerWon(arr, c)){
            return true;
        }
        return false;
    }

    public static boolean isfull(char[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == '#'){
                    return false;
                }
            }
        }
        return true;
    }
}