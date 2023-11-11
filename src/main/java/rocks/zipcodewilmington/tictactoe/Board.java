package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        char ch = 'X';
        return checkRow(ch) || checkColumn(ch) || checkDiagonal1(ch) || checkDiagonal2(ch);
    }

    public Boolean isInFavorOfO() {
        char ch = 'O';
        return checkRow(ch) || checkColumn(ch) || checkDiagonal1(ch) || checkDiagonal2(ch);
    }

    public Boolean checkRow(char ch){
        int i, j;
        for (i = 0; i < matrix.length; i++){
            for (j = 0; j < matrix.length; j++){
                if (matrix[i][j] != ch){
                    break;
                }
            }
            if (j == matrix.length){
                return true;
            }
        }
        return false;
    }

    public Boolean checkColumn(char ch){
        int i, j;
        for (i = 0; i < matrix.length; i++){
            for (j = 0; j < matrix.length; j++){
                if (matrix[j][i] != ch){
                    break;
                }
            }
            if (j == matrix.length){
                return true;
            }
        }
        return false;
    }

    public Boolean checkDiagonal1(char ch){
        // Test winning [0][0] -> [max][max] diagonal
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i][i] != ch){
                break;
            }
            if (i == matrix.length - 1){
                return true;
            }
        }
        return false;
    }

    public Boolean checkDiagonal2(char ch){
        // Test winning [max][0] -> [0][max] diagonal
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i][matrix.length - i - 1] != ch){
                break;
            }
            if (i == matrix.length - 1){
                return true;
            }
        }
        return false;
    }

    public Boolean isTie() {
        return !isInFavorOfO() && !isInFavorOfX();
    }

    public String getWinner() {
        if (isInFavorOfX()){
            return "X";
        }
        else if (isInFavorOfO()){
            return "O";
        }
        else {
            return "";
        }
    }

}
