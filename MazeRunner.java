/*
Find a way out of the maze. 1 represents wall, 0 represents a way.

Given a point (row, col) of a maze, determine if there is a way out i.e., return true if a path exists, false otherwise.

For example, given a maze:
                                {{ 1, 1, 1, 1, 1 },
                                { 1, 0, 1, 0, 0 },
                                { 1, 0, 1, 0, 1 },
                                { 1, 0, 0, 0, 1 },
                                { 1, 0, 1, 1, 1 },
                                { 1, 0, 1, 0, 1 },
                                { 1, 0, 1, 0, 1 },
                                { 1, 1, 1, 1, 1 } };

point(6, 1) should return true. 6 is the the 7th row and 1 is the 2nd column
point(5, 3) should return false
*/


import java.util.*;
public class MazeRunner {

    public static int[][] maze={{ 1, 1, 1, 1, 1 },
                                { 1, 0, 1, 0, 0 },
                                { 1, 0, 1, 0, 1 },
                                { 1, 0, 0, 0, 1 },
                                { 1, 0, 1, 1, 1 },
                                { 1, 0, 1, 0, 1 },
                                { 1, 0, 1, 0, 1 },
                                { 1, 1, 1, 1, 1 } };

    public static int height = maze.length;
    public static int width = maze[0].length;
    public static boolean aggregate = false;

    public static boolean recurse(int row, int col) {
        
        if ((row == height - 1) || (row == 0) || (col == width - 1) || (col == 0)) {
            return true;
        }
        else {
            maze[row][col] = 1;
            if(maze[row][col + 1] == 0){
                aggregate = (aggregate || recurse(row, col + 1));
            }
            if(maze[row][col - 1] == 0){
                aggregate = (aggregate || recurse(row, col - 1));
            }
            if(maze[row + 1][col] == 0){
                aggregate = (aggregate || recurse(row + 1, col));
            }
            if(maze[row - 1][col] == 0){
                aggregate = (aggregate || recurse(row - 1, col));
            }
            return aggregate;
        }
    }

    public static boolean wayOut(int x, int y) {
        if(maze[x][y] == 1){
            return false;
        }
        else{
            return recurse(x, y);
        }
            
    }
    public static void main(String[] args) {
        int x = 6;
        int y = 1;
        System.out.println(wayOut(x,y));
    }
}