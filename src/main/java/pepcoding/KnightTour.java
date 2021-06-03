package pepcoding;

public class KnightTour {

    public static void main(String[] args) {
        printTour(new int[5][5], 2, 2, 1);
    }

    private static void printTour(int[][] chessArray, int currentRow, int currentColumn, int moveNumber) {
        if(currentRow < 0 || currentColumn < 0 ||
            currentRow >= chessArray.length || currentColumn >= chessArray.length ||
            chessArray[currentRow][currentColumn] > 0) {
            return;
        } else if(moveNumber == chessArray.length * chessArray.length) {
            chessArray[currentRow][currentColumn] = moveNumber;
            displayChessArray(chessArray);
            chessArray[currentRow][currentColumn] = 0;
            return;
        }

        chessArray[currentRow][currentColumn] = moveNumber;

        printTour(chessArray, currentRow - 2, currentColumn + 1, moveNumber + 1);
        printTour(chessArray, currentRow - 1, currentColumn + 2, moveNumber + 1);
        printTour(chessArray, currentRow + 1, currentColumn + 2, moveNumber + 1);
        printTour(chessArray, currentRow + 2, currentColumn + 1, moveNumber + 1);

        printTour(chessArray, currentRow + 2, currentColumn - 1, moveNumber + 1);
        printTour(chessArray, currentRow + 1, currentColumn - 2, moveNumber + 1);
        printTour(chessArray, currentRow - 1, currentColumn - 2, moveNumber + 1);
        printTour(chessArray, currentRow - 2, currentColumn - 1, moveNumber + 1);

        chessArray[currentRow][currentColumn] = 0;
    }

    private static void displayChessArray(int[][] chessArray) {
        for(int i = 0; i < chessArray.length; i++) {
            for(int j = 0; j < chessArray.length; j++) {
                System.out.print(chessArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
