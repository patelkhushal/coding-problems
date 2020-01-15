import java.util.*;

class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> wordsPresent = new ArrayList<String>();
        for (String word : words) {
            if (wordExist(word, board)) {
                wordsPresent.add(word);
            }
            else if(wordExistLU(word, board)){
                wordsPresent.add(word);
            }
        }
        Collections.reverse(wordsPresent);
        return wordsPresent;
        

    }

    public static boolean wordExist(String word, char[][] board) {
        // char[][] markBoard = board;
        // char[][] markBoardLU = board;
        // markBoardRD[0][0] = 'x';
        // markBoardLU[0][0] = 'x';
        int lr = -1;
        int lc = -1;
        return recurse(board, word, 0, 0, 0, lr, lc);
    }

    public static boolean wordExistLU(String word, char[][] board) {
        // char[][] markBoard = board;
        // char[][] markBoardLU = board;
        // markBoardRD[0][0] = 'x';
        // markBoardLU[0][0] = 'x';
        return recurseLU(board, word, 0, board.length - 1, board[0].length - 1);
    }

    public static boolean recurse(char[][] board, String word, int letterIndex, int row, int col, int lr, int lc){
        if(row >= board.length || col >= board[0].length || row < 0 || col < 0){
            return false;
        }
        else if(row == lr && col == lc){
            return false;
        }
        else if(letterIndex == word.length() - 1 && word.charAt(letterIndex) == board[row][col]){
            return true;
        }
        else if(letterIndex == word.length() - 1 && word.charAt(letterIndex) != board[row][col]){
            return false;
        }
        else if(word.charAt(letterIndex) == board[row][col]){
            if(letterIndex == 0){
                lr = row; lc = col;
            }
            return recurse (board, word, letterIndex + 1, row + 1, col) || recurse (board, word, letterIndex + 1, row, col + 1);
        }
        else if(word.charAt(letterIndex) != board[row][col] && letterIndex == 0){
            // markBoard[row][col] = 'x';
            return recurse (board, word, letterIndex, row + 1, col) || recurse (board, word, letterIndex, row, col + 1);
        }
        else{
            return false;
        }
    }

    public static boolean recurseLU(char[][] board, String word, int letterIndex, int row, int col){
        if(row >= board.length || col >= board[0].length || row < 0 || col < 0){
            return false;
        }
        // else if(markBoard[row][col] == 'x'){
        //     markBoard[row][col] = board[row][col];
        //     return false;
        // }
        else if(letterIndex == word.length() - 1 && word.charAt(letterIndex) == board[row][col]){
            return true;
        }
        else if(letterIndex == word.length() - 1 && word.charAt(letterIndex) != board[row][col]){
            return false;
        }
        else if(word.charAt(letterIndex) == board[row][col]){
            // markBoard[row][col] = 'x';
            return recurseLU (board, word, letterIndex + 1, row - 1, col) || recurseLU (board, word, letterIndex + 1, row, col - 1);
        }
        else if(word.charAt(letterIndex) != board[row][col] && letterIndex == 0){
            // markBoard[row][col] = 'x';
            return recurseLU (board, word, letterIndex, row - 1, col) || recurseLU (board, word, letterIndex, row, col - 1);
        }
        else{
            return false;
        }
    }
}