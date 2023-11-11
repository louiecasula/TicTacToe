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
        int i, j;
        // Test winning row
        for (i = 0; i < matrix.length; i++){
            for (j = 0; j < matrix.length; j++){
                if (matrix[i][j] != 'X'){
                    break;
                }
            }
            if (j == matrix.length){
                return true;
            }
        }
        // Test winning column
        for (i = 0; i < matrix.length; i++){
            for (j = 0; j < matrix.length; j++){
                if (matrix[j][i] != 'X'){
                    break;
                }
            }
            if (j == matrix.length){
                return true;
            }
        }
        // Test winning [0][0] -> [max][max] diagonal
        for (i = 0; i < matrix.length; i++){
            if (matrix[i][i] != 'X'){
                break;
            }
            if (i == matrix.length - 1){
                return true;
            }
        }
        // Test winning [max][0] -> [0][max] diagonal
        for (i = 0; i < matrix.length; i++){
            if (matrix[i][matrix.length - i - 1] != 'X'){
                break;
            }
            if (i == matrix.length - 1){
                return true;
            }
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        int i, j;
        // Test winning row
        for (i = 0; i < matrix.length; i++){
            for (j = 0; j < matrix.length; j++){
                if (matrix[i][j] != 'O'){
                    break;
                }
            }
            if (j == matrix.length){
                return true;
            }
        }
        // Test winning column
        for (i = 0; i < matrix.length; i++){
            for (j = 0; j < matrix.length; j++){
                if (matrix[j][i] != 'O'){
                    break;
                }
            }
            if (j == matrix.length){
                return true;
            }
        }
        // Test winning [0][0] -> [max][max] diagonal
        for (i = 0; i < matrix.length; i++){
            if (matrix[i][i] != 'O'){
                break;
            }
            if (i == matrix.length - 1){
                return true;
            }
        }
        // Test winning [max][0] -> [0][max] diagonal
        for (i = 0; i < matrix.length; i++){
            if (matrix[i][matrix.length - i - 1] != 'O'){
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
        if (isInFavorOfO()){
            return "O";
        }
        else if (isInFavorOfX()){
            return "X";
        }
        else {
            return "";
        }
    }

}
