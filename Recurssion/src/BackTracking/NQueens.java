package BackTracking;

public class NQueens {

    public static void main(String[] args) {
        int n = 4;
        boolean[][] Board = new boolean[n][n];
        queens(Board , 0);
//        System.out.println(answer);
    }
    static int queens(boolean[][] Board , int row){

        if(row == Board.length){
            display(Board);
            System.out.println();
            return 1;
        }
        int count = 0;
//        Now placing the queen and checking for every row, we check if queen is present in same row , col and corresponding diagonal if not we place the queen.

        for(int col = 0; col < Board.length; col++){
//            Place the queen if it is safe.
            if(isSafe(Board, row , col)) {
                Board[row][col] = true;
                count += queens(Board, row+1);
//                after returning from recursion call we make the current row and col false;
                Board[row][col] = false;
            }
        }
        return count;
    }
    static boolean isSafe(boolean[][] Board , int row , int col) {
//        to Check Vertical row
        for (int i = 0; i < row; i++) {
            if (Board[i][col]) {
                return false;
            }
        }
//        for Diagonal Left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (Board[row - i][col - i]) {
                return false;
            }
        }
//        Diagonal Right
        int maxRight = Math.min(row, Board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (Board[row - i][col + i]) {
                return false;
            }


        }
        return true;
    }
    static void display(boolean[][] boards){
        for(boolean[] first_row: boards){
            for(boolean element : first_row){
                if(element){
                    System.out.print(" Q ");
                }
                else{
                    System.out.print(" X ");
                }
            }
            System.out.println();

        }
    }

}



