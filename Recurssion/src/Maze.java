import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {

//        System.out.println(count(3 , 3));
//
//        System.out.println(pathDiagonal("", 3 ,3 ));

//        boolean[][] maze = {
//                {true, true,true},
//                {true, false,true},
//                {true, true,true}
//        };
            path("",3,3);
//        obstaclePath("" , maze , 0 , 0);





    }


//    static int count(int r , int col){
//        if(r == 1 || col == 1){
//            return 1;
//        }
//
//        int down = count(r-1 , col);
//        int forward = count(r , col-1);
//        return down + forward;
//    }



//
////    Printing Path
//
    static void path(String p , int r , int c){
//        if row and col both are equal to 1
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r > 1){
            path(p+'D' , r-1 , c);
        }
        if(c > 1){
            path(p+'R' , r, c-1);
        }
    }
//
////    Returning as a ArrayList and Going Diagonally is also allowed.
//
//    static ArrayList<String> pathDiagonal(String p , int r , int c){
//
//        if(r == 1 && c == 1){
//            ArrayList<String> ans = new ArrayList<String>();
//            ans.add(p);
//            return ans;
//        }
//
//        ArrayList<String>  list = new ArrayList<String>();
//
//        if(r > 1 && c > 1){
//            list.addAll(pathDiagonal(p+'D' , r-1 , c));
//        }
//
//        if(r > 1){
//            list.addAll(pathDiagonal(p+'V' , r-1 , c));
//
//        }
//        if(c > 1){
//            list.addAll(pathDiagonal(p+'H' , r, c-1));
//        }
//
//        return list;
//    }

//    Now give a matrix with obstacle in its way.

//    static void obstaclePath(String p , boolean[][] maze , int r , int c){
//
//        if(r == maze.length-1 && c == maze[0].length-1){
//            System.out.println(p);
//            return;
//        }
//        if(!maze[r][c]){
//            return;
//        }
//        if(r < maze.length-1){
//            obstaclePath(p+'D' ,maze , r+1 , c);
//        }
//        if(c < maze[0].length-1){
//            obstaclePath(p+'R' ,maze , r, c+1);
//        }
//
//    }


}
