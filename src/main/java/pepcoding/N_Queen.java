package pepcoding;

public class N_Queen {
    public static void main(String[] args) {
        printQueens(new int[4][4], "", 0);
    }

    private static void printQueens(int[][] chessArray, String queenPlaced, int row) {
        if(row == chessArray.length) {
            System.out.println(queenPlaced);
            return;
        }

        for(int column = 0; column < chessArray.length; column ++) {
            if(isSafePlaceForQueen(chessArray, row, column)) {
                chessArray[row][column] = 1;
                printQueens(chessArray, queenPlaced + row + " - " + column + ", ", row + 1);
                chessArray[row][column] = 0;
            }
        }
    }

    private static boolean isSafePlaceForQueen(int[][] chessArray, int row, int column) {
        boolean isUnsafePosition = isThereQueenSittingInVerticalPosition(chessArray, row, column) ||
                                    isThereQueenSittingInRightDiagonalPosition(chessArray, row, column) ||
                                    isThereQueenSittingInLeftDiagonalPosition(chessArray, row, column);

        return !isUnsafePosition;
    }

    private static boolean isThereQueenSittingInVerticalPosition(int[][] chessArray, int row, int column) {
        for(int i = row - 1; i >= 0; i--) {
            if(chessArray[i][column] == 1)
                return true;
        }
        return false;
    }

    private static boolean isThereQueenSittingInLeftDiagonalPosition(int[][] chessArray, int row, int column) {
        for(int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--)
            if(chessArray[i][j] == 1)
                return true;
        return false;
    }

    private static boolean isThereQueenSittingInRightDiagonalPosition(int[][] chessArray, int row, int column) {
        for(int i = row - 1, j = column + 1; i >= 0 && j < chessArray.length; i--, j++)
            if(chessArray[i][j] == 1)
                return true;
        return false;
    }
}
