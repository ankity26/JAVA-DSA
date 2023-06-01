package BackTracking;

import java.lang.annotation.Target;

public class WordSearch {

    static boolean[][] visited;
    public static void main(String[] args) {


        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'},
        };
        String word = "ABCCED";
        int row = board.length;
        int col = board[0].length;

        visited = new boolean[row][col];
        boolean answer = false;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){

                if(board[i][j] == word.charAt(0) && wordSearch(board , i , j , 0 , word)){
                     answer =  true;
                }
            }
        }

        System.out.println(answer);


    }

    private static boolean wordSearch(char[][] board, int i, int j, int index, String target) {
        if(index == target.length()){
            return true;
        }

        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || target.charAt(index) != board[i][j] || visited[i][j]){
            //here we check if element we are current index is inside our boundary and if element at our current index is not equal to target element we return false.
            return false;
        }

        visited[i][j] = true;


        if( wordSearch(board , i+1 ,  j , index+1 , target)||               //checking down
                wordSearch(board , i-1 ,  j , index+1 , target)||              //checking up-side
                wordSearch(board , i ,  j+1 , index+1 , target)||               //checking right side
                wordSearch(board , i ,  j-1 , index+1 , target)){                  //checking left side.
            return true;
        }

        visited[i][j] = false;  //backtracking and marking it false
        return false;
    }


}
